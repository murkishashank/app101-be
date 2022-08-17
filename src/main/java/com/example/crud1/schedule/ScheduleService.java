package com.example.crud1.schedule;

import java.util.List;

import org.springframework.stereotype.Service;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public interface ScheduleService {

    List<ScheduleEntity> findByUserId(Integer id);

    ScheduleEntity saveDetails(ScheduleEntity record);

}
