package com.example.demospringBoot3.service;

import com.example.demospringBoot3.model.Student;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();

    @Autowired
    private ObservationRegistry observationRegistry;


    public Student addStudent(Student student) {
        students.add(student);
        return Observation.createNotStarted("addStudent", observationRegistry)
                .observe(()->student);
        //return student;
    }

    public List<Student> getStudents(){
       // return students;
        return Observation.createNotStarted("getStudents", observationRegistry)
                .observe(()->students);

    }

    public Student getStudent(String id) {
//        return students.stream()
//                .filter(student -> student.id().equals(id))
//                .findFirst()
//               .orElseThrow(()->new RuntimeException("Requested Student details Not found"));



        return Observation.createNotStarted("getStudent", observationRegistry)
                .observe(()-> students.stream()
                        .filter(student -> student.id().equals(id))
                        .findFirst()
                        .orElseThrow(()->new RuntimeException("Requested Student details Not found")));
    }
}
