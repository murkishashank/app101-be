package com.example.crud1.holidays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolidayServiceImpl implements HolidayService {

    @Autowired
    private HolidayRepo holidayRepo;

    public HolidayServiceImpl(HolidayRepo holidayRepo) {
        super();
        this.holidayRepo = holidayRepo;
    }


    @Override
    public List<HolidaysEntity> getAllHolidays() {
        return holidayRepo.findAll();
    }
    
}
