package com.example.day11.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode= ScopedProxyMode.TARGET_CLASS)
public class ScopeBean {
    public String password;
    public String emp_name;

    public void employeeDetails(String emp_name, String password) {
        this.emp_name = emp_name;
        this.password = password;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getPassword() {
        return password;
    }
}
