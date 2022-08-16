package com.example.crud1.FinancialDetails;

import java.util.List;

public interface FinancialDetailsService {

    List<FinancialDetailsEntity> getAllFinancialDetails();

    List<FinancialDetailsEntity> findByUserId(Integer id);

}
