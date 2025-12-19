package com.namancodes.crud_employee.dao;

import com.namancodes.crud_employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.Path;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//http://localhost:8080/swagger-ui/index.html#/ Hit this endpoint to scan all the endpoints associated with the application.

//@RepositoryRestResource(path="members") By default jpa-rest take entity plural to expose endpoints, if we want to change it,we can specify using path.
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    // No need to write any code, jpaRepo offers predefined functions.
}
