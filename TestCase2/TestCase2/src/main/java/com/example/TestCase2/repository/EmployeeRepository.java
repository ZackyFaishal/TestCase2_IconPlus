package com.example.TestCase2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TestCase2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { }
