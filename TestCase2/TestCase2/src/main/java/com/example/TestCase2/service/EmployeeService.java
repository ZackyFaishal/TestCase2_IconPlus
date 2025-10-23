package com.example.TestCase2.service;

import com.example.TestCase2.model.*;
import com.example.TestCase2.repository.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    public Employee createEmployee(Employee employee) {
        if (employee.getName() == null || employee.getName().isEmpty())
            throw new IllegalArgumentException("Nama wajib diisi.");
        if (employee.getDepartment() == null || employee.getDepartment().getId() == null)
            throw new IllegalArgumentException("Department wajib diisi.");
        if (employee.getSalary() == null || employee.getSalary() <= 0)
            throw new IllegalArgumentException("Salary harus lebih dari 0.");

        Department dept = departmentRepository.findById(employee.getDepartment().getId())
                .orElseThrow(() -> new IllegalArgumentException("Department tidak ditemukan."));
        employee.setDepartment(dept);

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Data karyawan tidak ditemukan."));
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee employee = getEmployeeById(id);

        employee.setName(updatedEmployee.getName());
        employee.setSalary(updatedEmployee.getSalary());

        Department dept = departmentRepository.findById(updatedEmployee.getDepartment().getId())
                .orElseThrow(() -> new IllegalArgumentException("Department tidak ditemukan."));
        employee.setDepartment(dept);

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee employee = getEmployeeById(id);
        employeeRepository.delete(employee);
    }
}
