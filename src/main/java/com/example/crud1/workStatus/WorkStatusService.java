package com.example.crud1.workStatus;

import java.util.List;

public interface WorkStatusService {

    List<WorkStatusEntity> getAllTasks();

    WorkStatusEntity saveTask(WorkStatusEntity record);

    List<WorkStatusEntity> findByUserId(Integer id);

    Iterable<WorkStatusEntity> saveAllTasks(Iterable<WorkStatusEntity> workStatusRecord);

}
