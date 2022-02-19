package com.employee.crudactivity.service;

import com.employee.crudactivity.entity.Employee;
import com.employee.crudactivity.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deletedById(int id);
}
