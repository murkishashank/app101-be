package com.example.crud1.FinancialDetails;

import java.util.List;

public interface FinancialDetailsService {

    List<FinancialDetailsEntity> getAllFinancialDetails();

    List<FinancialDetailsEntity> findByUserId(Integer userId);

    List<FinancialDetailsEntity> findBySalCreditedMonth(String salCreditedMonth);

    Iterable<FinancialDetailsEntity> saveAllRecords(Iterable<FinancialDetailsEntity> allEmpFinancialRecords);

}
