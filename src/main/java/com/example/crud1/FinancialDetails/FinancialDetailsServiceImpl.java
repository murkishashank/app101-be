package com.example.crud1.FinancialDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialDetailsServiceImpl implements FinancialDetailsService{


    @Autowired
    private FinancialDetailsRepo financialDetailsRepo;

    public FinancialDetailsServiceImpl(FinancialDetailsRepo financialDetailsRepo) {
        this.financialDetailsRepo = financialDetailsRepo;
    }

    @Override
    public List<FinancialDetailsEntity> getAllFinancialDetails() {
        return financialDetailsRepo.findAll();
    }

    
}
