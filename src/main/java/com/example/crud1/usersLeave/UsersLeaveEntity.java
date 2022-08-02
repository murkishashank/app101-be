package com.example.crud1.usersLeave;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.crud1.users.UsersEntity;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

@Entity
@Table(name = "users_leaves")
public class UsersLeaveEntity {
    @Column(name = "user_id")
    private int userId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private int id;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "reason")
    private String reason;

    @Column(name = "applied_date")
    private Date appliedDate;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "approved_flag")
    private String approvedFlag;
    
    @Column(name="leave_type")
    private String leaveType;

    @Column(name = "remarks")
    private String remarks;

    @JsonIncludeProperties({"userName"})
	@OneToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
	private UsersEntity userName;

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApprovedFlag() {
        return approvedFlag;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public void setApprovedFlag(String approvedFlag) {
        this.approvedFlag = approvedFlag;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getRemarks() {
        return remarks;
    }


    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public UsersEntity getUserName() {
        return userName;
    }

    public void setUserName(UsersEntity userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
 
}