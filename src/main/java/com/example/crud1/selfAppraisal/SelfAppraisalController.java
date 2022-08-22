package com.example.crud1.selfAppraisal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SelfAppraisalController {
    @Autowired
    private SelfAppraisalService selfAppraisalService;

    public SelfAppraisalController(SelfAppraisalService selfAppraisalService) {
        this.selfAppraisalService = selfAppraisalService;
    }

    @CrossOrigin
    @GetMapping("/selfAppraisal/allRecords")
    public List<SelfAppraisalEntity> getAllRecords() {
        return selfAppraisalService.findAll();
    }
    @CrossOrigin
    @PostMapping("/selfAppraisal")
    public ResponseEntity<SelfAppraisalEntity> saveLeaveDetails(@RequestBody SelfAppraisalEntity record) {
        SelfAppraisalEntity savedRecord = selfAppraisalService.saveDetails(record);
        return new ResponseEntity<SelfAppraisalEntity>(savedRecord, HttpStatus.OK);
    }
}
