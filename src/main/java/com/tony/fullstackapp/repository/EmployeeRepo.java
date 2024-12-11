package com.tony.fullstackapp.repository;

import com.tony.fullstackapp.model.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    // self defined functions
    void deleteEmployeeById(Long id);

    Optional findEmployeeById(Long id);
}
