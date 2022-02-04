package com.example.day11.controller;

import com.example.day11.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "employee")
public class EmpController {
    @Autowired
    public EmployeeService employeeService;

@GetMapping()
    public String registerEmployee(@RequestParam String emp_name, @RequestParam String password) {
        employeeService.registerEmp(emp_name, password);
        return "Employee registration sucessful!";
    }
}