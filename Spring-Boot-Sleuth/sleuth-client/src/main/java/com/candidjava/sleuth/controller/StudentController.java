package com.candidjava.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.candidjava.sleuth.models.Student;

@RestController
@RequestMapping(value = "/client")
public class StudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class.getName());
   
    @GetMapping(value = "/students")
    public Student[] getStudent() {

        LOGGER.info("Before Calling the Server");
     
        LOGGER.info("After Calling the Server");

        return new Student[1];
        
    }
}