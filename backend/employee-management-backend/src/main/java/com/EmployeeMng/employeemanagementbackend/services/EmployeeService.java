package com.EmployeeMng.employeemanagementbackend.services;

import com.EmployeeMng.employeemanagementbackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long empId);

    Employee getEmployeeById(Long empId);

    Employee updateEmployee(Long empId, Employee employee);
}
