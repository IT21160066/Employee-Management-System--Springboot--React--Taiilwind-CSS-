package com.EmployeeMng.employeemanagementbackend.model;

//to interact with the UI

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private long empId;
    private String firstName;
    private String lastName;
    private String emailID;
}
