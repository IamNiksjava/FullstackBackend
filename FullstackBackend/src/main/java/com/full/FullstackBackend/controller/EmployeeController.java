package com.full.FullstackBackend.controller;


import com.full.FullstackBackend.model.Employee;
import com.full.FullstackBackend.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private EmployeeRepository repository;

    public List<Employee> getAllEmployees(){
        return repository.findAll();

    }

}
