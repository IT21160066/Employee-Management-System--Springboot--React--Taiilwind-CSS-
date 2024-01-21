package com.EmployeeMng.employeemanagementbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;
    private String firstName;
    private String lastName;
    private String emailID;
}
