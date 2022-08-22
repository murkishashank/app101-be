package com.example.crud1.holidays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolidaysController {
    @Autowired
    public HolidayService holidayService;

    public HolidaysController(HolidayService holidayService) {
        this.holidayService = holidayService;
    }

    @CrossOrigin
    @GetMapping("/allHolidays")
    public List<HolidaysEntity> allHolidays() {
        return holidayService.getAllHolidays();
    }

    @CrossOrigin
    @PostMapping("/allHolidays")
    public Iterable<HolidaysEntity> saveTasks(@RequestBody Iterable<HolidaysEntity> newRecord) {
        return holidayService.saveAllTasks(newRecord);
    }
}
