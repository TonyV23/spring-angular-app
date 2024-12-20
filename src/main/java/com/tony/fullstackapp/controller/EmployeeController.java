package com.tony.fullstackapp.controller;

import com.tony.fullstackapp.model.Employee;
import com.tony.fullstackapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity <List<Employee>> getAllEmployees() {
        List <Employee> employees = employeeService.GetAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity <Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity <Employee> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.AddEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity <Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updateEmployee = employeeService.UpdateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <Employee> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.DeleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
