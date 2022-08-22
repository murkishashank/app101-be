package com.example.crud1.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService{
    @Autowired
    private ScheduleRepo scheduleRepo;

    public ScheduleServiceImpl(ScheduleRepo scheduleRepo) {
        this.scheduleRepo = scheduleRepo;
    }

    @Override
    public List<ScheduleEntity> findByUserId(Integer id) {
        return scheduleRepo.findByUserId(id);
    }

    @Override
    public ScheduleEntity saveDetails(ScheduleEntity record) {
        // TODO Auto-generated method stub
        return scheduleRepo.save(record);
    }

}
