package com.example.springboot.controller;

import com.example.springboot.entities.Employee;
import com.example.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired(required = false)
    EmployeeMapper employeeMapper;

    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable("id") Integer id){
       return employeeMapper.getEmployeeById(id);
    }

    @GetMapping("/insertEmployee")
    public int insertEmployee(Employee employee){
        return employeeMapper.insertEmployee(employee);
    }
}
