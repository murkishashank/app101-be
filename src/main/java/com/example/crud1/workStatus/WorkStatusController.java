package com.example.crud1.workStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkStatusController {

    @Autowired
    public WorkStatusService workStatusService;

    public WorkStatusController(WorkStatusService workStatusService) {
        super();
        this.workStatusService = workStatusService;
    }

    @CrossOrigin
    @GetMapping("/alltasks")
    public List<WorkStatusEntity> getAllTasks() {
        return workStatusService.getAllTasks();
    }

    @CrossOrigin
    @GetMapping("/task/{userId}")
    public List<WorkStatusEntity> findByUserId(@PathVariable("userId") Integer id) {
        return workStatusService.findByUserId(id);
    }

    @CrossOrigin
    @PostMapping("/task")
    public WorkStatusEntity saveTask(@RequestBody WorkStatusEntity workStatusRecord) {
        return workStatusService.saveTask(workStatusRecord);
    }

    @CrossOrigin
    @PostMapping("/tasks")
    public Iterable<WorkStatusEntity> saveTasks(@RequestBody Iterable<WorkStatusEntity> workStatusRecord) {
        return workStatusService.saveAllTasks(workStatusRecord);
    }
}
