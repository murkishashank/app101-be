package com.example.crud1.selfAppraisal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelfAppraisalRepo extends JpaRepository<SelfAppraisalEntity, Integer> {

}
