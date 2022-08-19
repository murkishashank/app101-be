package com.example.crud1.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @CrossOrigin
    @GetMapping("/schedule/{id}")
    public List<ScheduleEntity> getSchedule(@PathVariable("id") Integer id) {
        return scheduleService.findByUserId(id);
    }

    @CrossOrigin
    @PostMapping("/schedule")
    public ResponseEntity<ScheduleEntity> saveLeaveDetails(@RequestBody ScheduleEntity record) {
        ScheduleEntity savedRecord = scheduleService.saveDetails(record);
        return new ResponseEntity<ScheduleEntity>(savedRecord, HttpStatus.OK);
    }
}
