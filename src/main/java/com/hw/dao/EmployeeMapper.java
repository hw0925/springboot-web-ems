package com.hw.dao;

import com.hw.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    List<Employee> selectAllEmp();

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}