package com.ivanryabov.springboot.springdatarest.dao;



import com.ivanryabov.springboot.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByName(String name);
}
