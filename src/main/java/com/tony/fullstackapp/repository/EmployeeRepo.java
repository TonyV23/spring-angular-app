package com.tony.fullstackapp.repository;

import com.tony.fullstackapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {


}
