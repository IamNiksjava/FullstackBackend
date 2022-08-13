package com.full.FullstackBackend.controller;


import com.full.FullstackBackend.model.Employee;
import com.full.FullstackBackend.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "*") 
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;


    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        log.info("getting all employee");
        System.out.println(repository.findAll());
        return repository.findAll();

    }

}
