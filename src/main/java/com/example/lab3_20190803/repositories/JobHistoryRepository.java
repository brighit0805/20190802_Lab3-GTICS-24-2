package com.example.lab3_20190803.repositories;

import com.example.lab3_20190803.entities.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, String> {
}
