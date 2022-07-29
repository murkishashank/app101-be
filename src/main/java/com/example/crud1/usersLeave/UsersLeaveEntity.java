package com.example.crud1.usersLeave;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.crud1.users.UsersEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "users_leaves")
public class UsersLeaveEntity {
    @Column(name = "user_id")
    private int id;

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
    private Date appliedDate;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "approved_flag")
    private String approvedFlag;
    
    @Column(name="leave_type")
    private String leaveType;

    @Column(name = "remarks")
    private String remarks;

    // @OneToMany(user_id)
    @JsonInclude(value = Include.NON_NULL)
	@OneToMany(mappedBy = "id")
	private List<UsersEntity> user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
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

    public List<UsersEntity> getUser() {
        return user;
    }

    public void setUser(List<UsersEntity> user) {
        this.user = user;
    }

    
}