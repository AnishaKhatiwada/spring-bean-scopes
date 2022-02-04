package com.example.day11.service;

import com.example.day11.bean.ScopeBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    @Autowired
    public ScopeBean scopeBean;

    public void registerEmp(String emp_name,String password) {


        scopeBean.employeeDetails(emp_name, password);
        log.info("Employee name: {}", scopeBean.getEmp_name());
        log.info("Password: {}", scopeBean.getPassword());

    }
}
