package com.example.crud1.workStatus;

import java.sql.Date;
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
    public String assignedBy;

    @Column(name = "assigned_date")
    public Date taskAssignedDate;

    @Column(name = "completed_date")
    public Date taskCompletedDate;

    @Column(name = "remarks")
    public String remarks;

    @Column(name = "accepted_flag")
    public String acceptedFlag;

    @Column(name = "user_name")
    public String userName;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAcceptedFlag() {
        return acceptedFlag;
    }

    public void setAcceptedFlag(String acceptedFlag) {
        this.acceptedFlag = acceptedFlag;
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }




    public Date getTaskAssignedDate() {
        return taskAssignedDate;
    }


    public void setTaskAssignedDate(Date taskAssignedDate) {
        this.taskAssignedDate = taskAssignedDate;
    }


    public Date getTaskCompletedDate() {
        return taskCompletedDate;
    }


    public void setTaskCompletedDate(Date taskCompletedDate) {
        this.taskCompletedDate = taskCompletedDate;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    

}
