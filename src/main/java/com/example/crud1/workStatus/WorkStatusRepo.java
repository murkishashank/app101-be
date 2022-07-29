package com.example.crud1.workStatus;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkStatusRepo extends JpaRepository<WorkStatusEntity, Integer> {
    
}
