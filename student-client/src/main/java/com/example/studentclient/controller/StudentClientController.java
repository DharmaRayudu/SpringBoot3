package com.example.studentclient.controller;

import com.example.studentclient.model.Student;
import com.example.studentclient.service.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client/students")
public class StudentClientController {

    @Autowired
    private StudentClientService studentClientService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentClientService.getStudents();
    }
}
