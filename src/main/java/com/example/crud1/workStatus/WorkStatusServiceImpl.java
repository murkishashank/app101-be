package com.example.crud1.workStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkStatusServiceImpl implements WorkStatusService {

    @Autowired
    private WorkStatusRepo workStatusRepo;

    public WorkStatusServiceImpl(WorkStatusRepo workStatusRepo) {
        super();
        this.workStatusRepo = workStatusRepo;
    }

    @Override
    public List<WorkStatusEntity> getAllTasks() {
        return workStatusRepo.findAll();
    }

    @Override
    public WorkStatusEntity saveTask(WorkStatusEntity record) {
        return workStatusRepo.save(record);
    }

    @Override
    public List<WorkStatusEntity> findByUserId(Integer id) {
        return workStatusRepo.findByUserId(id);
    }

    @Override
    public Iterable<WorkStatusEntity> saveAllTasks(Iterable<WorkStatusEntity> workStatusRecord) {
        return workStatusRepo.saveAll((Iterable<WorkStatusEntity>) workStatusRecord);
    }
}
