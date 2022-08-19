package com.example.crud1.schedule;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepo extends JpaRepository<ScheduleEntity, Integer> {

    List<ScheduleEntity> findByUserId(Integer id);

}
