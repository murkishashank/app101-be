package com.example.crud1.workStatus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkStatusRepo extends JpaRepository<WorkStatusEntity, Integer> {
    List<WorkStatusEntity> findByUserId(Integer userId);
}
