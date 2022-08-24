package com.example.crud1.FinancialDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialDetailsServiceImpl implements FinancialDetailsService {

    @Autowired
    private FinancialDetailsRepo financialDetailsRepo;

    public FinancialDetailsServiceImpl(FinancialDetailsRepo financialDetailsRepo) {
        this.financialDetailsRepo = financialDetailsRepo;
    }

    @Override
    public List<FinancialDetailsEntity> getAllFinancialDetails() {
        return financialDetailsRepo.findAll();
    }

    @Override
    public List<FinancialDetailsEntity> findByUserId(Integer userId) {
        return financialDetailsRepo.findByUserId(userId);
    }

    @Override
    public List<FinancialDetailsEntity> findBySalCreditedMonth(String salCreditedMonth) {
        return financialDetailsRepo.findBySalCreditedMonth(salCreditedMonth);
    }

    @Override
    public Iterable<FinancialDetailsEntity> saveAllRecords(Iterable<FinancialDetailsEntity> allEmpFinancialRecords) {
        // TODO Auto-generated method stub
        return financialDetailsRepo.saveAll((Iterable<FinancialDetailsEntity>) allEmpFinancialRecords);

    }

    @Override
    public FinancialDetailsEntity saveFinancialDetails(FinancialDetailsEntity financialDetailsEntity) {
        // TODO Auto-generated method stub
        return financialDetailsRepo.save(financialDetailsEntity);
    }

}
