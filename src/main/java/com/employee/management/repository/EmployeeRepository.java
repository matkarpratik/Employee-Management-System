package com.employee.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}