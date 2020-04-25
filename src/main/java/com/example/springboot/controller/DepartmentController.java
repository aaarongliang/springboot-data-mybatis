package com.example.springboot.controller;

import com.example.springboot.entities.Department;
import com.example.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired(required = false)
    DepartmentMapper departmentMapper;

    @GetMapping("/query/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){
        return departmentMapper.getDepartmentById(id);
    }

    @GetMapping("/insert")
    public int insert(Department department){
        return departmentMapper.insertDepartment(department);
    }

    @GetMapping("/delete/{id}")
    public int deleteDepartment(@PathVariable("id") Integer id){
        return departmentMapper.deleteDepartmentById(id);
    }

    @GetMapping("/update")
    public int updateDepartment(Department department){
        return departmentMapper.updateDepartment(department);
    }
}
