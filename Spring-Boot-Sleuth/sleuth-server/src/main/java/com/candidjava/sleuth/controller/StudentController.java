package com.candidjava.sleuth.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.candidjava.sleuth.models.Student;
import com.candidjava.sleuth.service.StudentService;


@RestController
@RequestMapping("/server/student")
public class StudentController {
	@Autowired
	StudentService service;
	
	 @Autowired
	    private RestTemplate restTemplate;


    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class.getName());

 
    @GetMapping
	public List<Student> get() {
    	  LOGGER.info("Reached app1..");
    	  
    	   Student[]  response =  restTemplate.getForObject("http://localhost:8080/client/students",Student[].class);
    	  
		return service.getAllStudents();
	}
}