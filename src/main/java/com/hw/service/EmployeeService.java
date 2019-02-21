package com.hw.service;

import com.hw.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //
    List<Employee> getAllEmp();
    //
    void addEmp(Employee employee);

    //
    void updateEmp(Employee employee);

    Employee getEmpById(Integer id);

    void deleteEmp(Integer id);
}
