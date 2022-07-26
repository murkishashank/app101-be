package com.example.crud1.usersLeave;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_leaves")
public class UsersLeaveEntity {
    @Column(name = "user_name")
    private String userName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private int requestId;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "reason")
    private String reason;

    @Column(name = "applied_date")
    private Timestamp appliedDate;

    @Column(name = "approved_date")
    private Timestamp approvedDate;

    @Column(name = "approved_flag")
    private String approvedFlag;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


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


    public Timestamp getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Timestamp appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Timestamp getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Timestamp approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getApprovedFlag() {
        return approvedFlag;
    }

    public void setApprovedFlag(String approvedFlag) {
        this.approvedFlag = approvedFlag;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    


    
}
// reason varchar(225) 
// create_timestamp timestamp 
// change_timestamp timestamp 
// approved_flag varchar(1)