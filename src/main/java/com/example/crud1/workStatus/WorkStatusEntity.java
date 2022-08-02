package com.example.crud1.workStatus;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "work_status")
@AllArgsConstructor
@NoArgsConstructor
public class WorkStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    public int id;

    @Column(name = "user_id")
    public int userId;

    @Column(name = "task_name")
    public String taskName;

    @Column(name = "task_desc")
    public String taskDescription;

    @Column(name = "task_status")
    public String taskStatus;

    @Column(name = "assigned_by")
    public int assignedBy;

    @Column(name = "assigned_timestamp")
    public LocalDateTime assignedTimeStamp;

    @Column(name = "completed_timestamp")
    public LocalDateTime completedTimeStamp;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(int assignedBy) {
        this.assignedBy = assignedBy;
    }

    public LocalDateTime getAssignedTimeStamp() {
        return assignedTimeStamp;
    }

    public void setAssignedTimeStamp(LocalDateTime assignedTimeStamp) {
        this.assignedTimeStamp = assignedTimeStamp;
    }

    public LocalDateTime getCompletedTimeStamp() {
        return completedTimeStamp;
    }

    public void setCompletedTimeStamp(LocalDateTime completedTimeStamp) {
        this.completedTimeStamp = completedTimeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

// assigned
// WIP
// QA
// Completed
