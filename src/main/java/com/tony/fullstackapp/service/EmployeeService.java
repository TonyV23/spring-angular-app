package com.tony.fullstackapp.service;

import com.tony.fullstackapp.exception.UserNotFoundException;
import com.tony.fullstackapp.model.Employee;
import com.tony.fullstackapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> GetAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee AddEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public Employee UpdateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee DeleteEmployee(Employee employee) {
        employeeRepo.delete(employee);
        return employee;
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User with id --->" + id + "  was not found"));
    }

    public void DeleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
