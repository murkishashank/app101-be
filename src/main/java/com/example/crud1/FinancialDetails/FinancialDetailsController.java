package com.example.crud1.FinancialDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FinancialDetailsController {
    
    @Autowired
    private FinancialDetailsService financialDetailsService;

    public FinancialDetailsController(FinancialDetailsService financialDetailsService) {
        this.financialDetailsService = financialDetailsService;
    }

    @GetMapping("/allFinancialDetails")
    @CrossOrigin
    public List<FinancialDetailsEntity> getAllFinancialDetails(){
        return  financialDetailsService.getAllFinancialDetails();
    }
}
