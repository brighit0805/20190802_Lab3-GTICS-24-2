package com.example.lab3_20190803.repositories;

import com.example.lab3_20190803.entities.Employee;
import com.example.lab3_20190803.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
