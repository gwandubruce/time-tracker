/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Bruce Gwandu
 */
@Entity
public class TimeSheetObject implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    private Employee employee;
    private String log;
    private Integer vacationDaysUsed;
    private Integer sickLeaveUsed;
    private String employeeInitials;
    private String supervisorInitials;
    private LocalDate dateMonth;
    private Integer startingBalance;
    private Integer plusDaysEarned;
    private Integer minusDaysUsed;
    private Integer newBalance;
    private String onLeaveYesOrNo;
    private String comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Integer getVacationDaysUsed() {
        return vacationDaysUsed;
    }

    public void setVacationDaysUsed(Integer vacationDaysUsed) {
        this.vacationDaysUsed = vacationDaysUsed;
    }

    public Integer getSickLeaveUsed() {
        return sickLeaveUsed;
    }

    public void setSickLeaveUsed(Integer sickLeaveUsed) {
        this.sickLeaveUsed = sickLeaveUsed;
    }

    public String getEmployeeInitials() {
        return employeeInitials;
    }

    public void setEmployeeInitials(String employeeInitials) {
        this.employeeInitials = employeeInitials;
    }

    public String getSupervisorInitials() {
        return supervisorInitials;
    }

    public void setSupervisorInitials(String supervisorInitials) {
        this.supervisorInitials = supervisorInitials;
    }

    public LocalDate getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(LocalDate dateMonth) {
        this.dateMonth = dateMonth;
    }

    public Integer getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(Integer startingBalance) {
        this.startingBalance = startingBalance;
    }

    public Integer getPlusDaysEarned() {
        return plusDaysEarned;
    }

    public void setPlusDaysEarned(Integer plusDaysEarned) {
        this.plusDaysEarned = plusDaysEarned;
    }

    public Integer getMinusDaysUsed() {
        return minusDaysUsed;
    }

    public void setMinusDaysUsed(Integer minusDaysUsed) {
        this.minusDaysUsed = minusDaysUsed;
    }

    public Integer getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Integer newBalance) {
        this.newBalance = newBalance;
    }

    public String getOnLeaveYesOrNo() {
        return onLeaveYesOrNo;
    }

    public void setOnLeaveYesOrNo(String onLeaveYesOrNo) {
        this.onLeaveYesOrNo = onLeaveYesOrNo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
    
   
}
