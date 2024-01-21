package com.EmployeeMng.employeemanagementbackend.services;

import com.EmployeeMng.employeemanagementbackend.entity.EmployeeEntity;
import com.EmployeeMng.employeemanagementbackend.model.Employee;
import com.EmployeeMng.employeemanagementbackend.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
        this.employeeRepository = employeeRepo;
    }
    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<Employee> employees = employeeEntities.stream()
                .map(emp -> new Employee(
                        emp.getEmpId(),
                        emp.getFirstName(),
                        emp.getLastName(),
                        emp.getEmailID()))
                .collect(Collectors.toList());
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long empId) {
        EmployeeEntity employeeEntity = employeeRepository.findById(empId).get();
        employeeRepository.delete(employeeEntity);
        return  true;
    }

    @Override
    public Employee getEmployeeById(Long empId) {
        EmployeeEntity employeeEntity =  employeeRepository.findById(empId).get();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity, employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Long empId, Employee employee) {
        EmployeeEntity employeeEntity = employeeRepository.findById(empId).get();
        employeeEntity.setFirstName(employee.getFirstName());
        employeeEntity.setLastName(employee.getLastName());
        employeeEntity.setEmailID(employee.getEmailID());
        employeeRepository.save(employeeEntity);
        return employee;
    }
}
