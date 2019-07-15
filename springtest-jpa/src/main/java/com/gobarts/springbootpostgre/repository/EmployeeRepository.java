package com.gobarts.springbootpostgre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.gobarts.springbootpostgre.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
