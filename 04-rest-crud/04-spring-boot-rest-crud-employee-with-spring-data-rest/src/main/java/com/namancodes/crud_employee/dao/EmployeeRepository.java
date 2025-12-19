package com.namancodes.crud_employee.dao;

import com.namancodes.crud_employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    // No need to write any code, jpaRepo offers predefined functions.
}
