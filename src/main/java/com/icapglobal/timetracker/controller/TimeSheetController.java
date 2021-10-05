/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker.controller;

import com.icapglobal.timetracker.repository.EmployeeRepository;
import com.icapglobal.timetracker.repository.TimeSheetObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Bruce Gwandu
 */
@Controller
public class TimeSheetController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private TimeSheetObjectRepository timeSheetObjectRepository;

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/employeeview")
    public String editTimeSheet() {

        return "employeeview";
    }

    @GetMapping("/supervisorview")
    public String approveTimeSheets() {

        return "supervisorview";
    }

    @GetMapping("/hrmanagerview")
    public String finalApproval() {

        return "hrmanagerview";
    }

}
