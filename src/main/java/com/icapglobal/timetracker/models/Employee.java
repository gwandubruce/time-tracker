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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Bruce Gwandu
 *
 *
 * Employee (name, date of birth, job title[allow for typing], employee number
 * [allow for typing], employee category [employee, supervisor, human resources
 * manager], immedeate supervisor[allow for prepopulated selections and each
 * employee will have one immedeate supervisor])
 */

@Entity
public class Employee implements Serializable {

    @OneToOne(mappedBy = "employee")
    private TimeSheetObject timeSheetObject;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmployeeId;
    private String name;
    private LocalDate dateOfBirth;
    private String jobTitle;
    private String employeeNumber;
    private String username;
    private String password;
    @ManyToOne
    private Employee supervisor;

    public enum Category {

        EMPLOYEE, SUPERVISOR, HUMAN_RESOURCES_MANAGER

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Long getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Long EmployeeId) {
        this.EmployeeId = EmployeeId;
    }
    
    
    
    

}
