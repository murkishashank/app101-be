package com.example.crud1.selfAppraisal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelfAppraisalServiceImpl implements SelfAppraisalService{
    @Autowired
    private SelfAppraisalRepo selfAppraisalRepo;

    public SelfAppraisalServiceImpl(SelfAppraisalRepo selfAppraisalRepo) {
        this.selfAppraisalRepo = selfAppraisalRepo;
    }

    @Override
    public SelfAppraisalEntity saveDetails(SelfAppraisalEntity record) {
        return selfAppraisalRepo.save(record);
    }

    @Override
    public List<SelfAppraisalEntity> findAll() {
        return selfAppraisalRepo.findAll();
    }

}
