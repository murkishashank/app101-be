package com.example.crud1.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialDetailsRepo extends JpaRepository<FinancialDetailsEntity, Integer> {

}
