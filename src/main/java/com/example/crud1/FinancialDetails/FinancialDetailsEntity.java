package com.example.crud1.FinancialDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "financial_details")
@AllArgsConstructor
@NoArgsConstructor
public class FinancialDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "acc_no")
    private String accountNumber;

    @Column(name = "pf_acc_no")
    private String pfAccountNumber;

    @Column(name = "bank_ifsc")
    private String bankIFSC;

    @Column(name = "bank_branch")
    private String bankBranchName;

    @Column(name = "pan_no")
    private String panNumber;

    @Column(name = "basic")
    private Integer basic;

    @Column(name = "house_rent_allowance")
    private Integer houseRentAllowance;

    @Column(name = "conveyance")
    private Integer conveyance;

    @Column(name = "medical_allowance")
    private Integer medicalAllowance;

    @Column(name = "prof_pursuits_allow")
    private Integer profPursuitsAllow;

    @Column(name = "arears")
    private Integer arears;

    @Column(name = "other_allowances")
    private Integer otherAllowances;

    @Column(name = "profession_tax")
    private Integer professionTax;

    @Column(name = "provident_fund")
    private Integer providentFund;

    @Column(name = "salary_credited_month")
    private String salCreditedMonth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPfAccountNumber() {
        return pfAccountNumber;
    }

    public void setPfAccountNumber(String pfAccountNumber) {
        this.pfAccountNumber = pfAccountNumber;
    }

    public String getBankIFSC() {
        return bankIFSC;
    }

    public void setBankIFSC(String bankIFSC) {
        this.bankIFSC = bankIFSC;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBasic() {
        return basic;
    }

    public void setBasic(Integer basic) {
        this.basic = basic;
    }

    public Integer getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public void setHouseRentAllowance(Integer houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    public Integer getConveyance() {
        return conveyance;
    }

    public void setConveyance(Integer conveyance) {
        this.conveyance = conveyance;
    }

    public Integer getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(Integer medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public Integer getProfPursuitsAllow() {
        return profPursuitsAllow;
    }

    public void setProfPursuitsAllow(Integer profPursuitsAllow) {
        this.profPursuitsAllow = profPursuitsAllow;
    }

    public Integer getArears() {
        return arears;
    }

    public void setArears(Integer arears) {
        this.arears = arears;
    }

    public Integer getOtherAllowances() {
        return otherAllowances;
    }

    public void setOtherAllowances(Integer otherAllowances) {
        this.otherAllowances = otherAllowances;
    }

    public Integer getProfessionTax() {
        return professionTax;
    }

    public void setProfessionTax(Integer professionTax) {
        this.professionTax = professionTax;
    }

    public Integer getProvidentFund() {
        return providentFund;
    }

    public void setProvidentFund(Integer providentFund) {
        this.providentFund = providentFund;
    }

    public String getSalCreditedMonth() {
        return salCreditedMonth;
    }

    public void setSalCreditedMonth(String salCreditedMonth) {
        this.salCreditedMonth = salCreditedMonth;
    }

}
