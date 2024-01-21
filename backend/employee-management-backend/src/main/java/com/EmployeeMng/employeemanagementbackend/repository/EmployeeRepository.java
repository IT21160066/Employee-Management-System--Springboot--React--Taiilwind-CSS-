package com.EmployeeMng.employeemanagementbackend.repository;

import com.EmployeeMng.employeemanagementbackend.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interact with the data base
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
