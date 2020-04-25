package com.example.springboot.mapper;

import com.example.springboot.entities.Employee;

public interface EmployeeMapper {
    public Employee getEmployeeById(Integer id);

    public int insertEmployee(Employee employee);
}
