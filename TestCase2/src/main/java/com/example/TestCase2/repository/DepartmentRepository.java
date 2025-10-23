package com.example.TestCase2.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TestCase2.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByNameIgnoreCase(String name);
}

