package com.example.lab3_20190803.repositories;

import com.example.lab3_20190803.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
