package com.example.springboot.mapper;

import com.example.springboot.entities.Department;
import org.apache.ibatis.annotations.*;

public interface DepartmentMapper {
    @Select("select * from Department where id=#{id}")
    public Department getDepartmentById(Integer id);

    @Delete("delete from Department where id=#{id}")
    public int deleteDepartmentById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into Department(department_name)values(#{departmentName})")
    public int insertDepartment(Department department);

    @Update("update Department set department_name=#{departmentName} where id=#{id}")
    public int updateDepartment(Department department);
}
