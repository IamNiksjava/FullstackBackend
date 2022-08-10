package com.full.FullstackBackend.controller;


import com.full.FullstackBackend.model.Employee;
import com.full.FullstackBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;


    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return repository.findAll();

    }

}
