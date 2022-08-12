package com.example.crud1.holidays;

import java.util.List;

import org.springframework.stereotype.Service;

import io.swagger.v3.oas.annotations.servers.Server;


@Service
public interface HolidayService {

    List<HolidaysEntity> getAllHolidays();

    Iterable<HolidaysEntity> saveAllTasks(Iterable<HolidaysEntity> newRecord);

}
