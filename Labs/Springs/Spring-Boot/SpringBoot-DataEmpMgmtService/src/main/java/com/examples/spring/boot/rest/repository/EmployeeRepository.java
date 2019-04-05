package com.examples.spring.boot.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.examples.spring.boot.rest.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
