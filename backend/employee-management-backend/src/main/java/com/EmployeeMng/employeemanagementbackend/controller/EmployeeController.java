package com.EmployeeMng.employeemanagementbackend.controller;

import com.EmployeeMng.employeemanagementbackend.model.Employee;
import com.EmployeeMng.employeemanagementbackend.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//controller to handle API requests
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return  employeeService.getAllEmployees();
    }

    @DeleteMapping("/employee/{empId}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long empId){
        boolean deleted = false;
        deleted = employeeService.deleteEmployee(empId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/employee/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long empId){
        Employee employee = null;
        employee = employeeService.getEmployeeById(empId);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("/employee/{empId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long empId, @RequestBody Employee employee){
        employee = employeeService.updateEmployee(empId, employee);
        return ResponseEntity.ok(employee);
    }
}
