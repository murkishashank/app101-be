package com.example.crud1.workStatus;

import java.util.List;

public interface WorkStatusService {

    List<WorkStatusEntity> getAllTasks();

    WorkStatusEntity saveTask(WorkStatusEntity record);

    List<WorkStatusEntity> findByUserId(Integer id);

    List<WorkStatusEntity> saveAllTasks(Iterable<WorkStatusEntity> workStatusRecord);

}
