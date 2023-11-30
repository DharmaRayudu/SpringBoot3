package com.example.studentclient.service;

import com.example.studentclient.model.Student;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("/students")
public interface StudentClientService {

    @GetExchange
    public List<Student> getStudents();
}
