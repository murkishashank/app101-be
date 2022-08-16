package com.example.crud1.FinancialDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialDetailsRepo extends JpaRepository<FinancialDetailsEntity, Integer> {

    List<FinancialDetailsEntity> findByUserId(Integer userId);

}
