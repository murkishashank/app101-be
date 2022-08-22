package com.example.crud1.selfAppraisal;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface SelfAppraisalService {

    List<SelfAppraisalEntity> findAll();

    SelfAppraisalEntity saveDetails(SelfAppraisalEntity record);

}
