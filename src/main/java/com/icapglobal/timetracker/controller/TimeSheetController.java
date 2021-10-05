/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker.controller;

import com.icapglobal.timetracker.models.TimeSheetObject;
import com.icapglobal.timetracker.repository.EmployeeRepository;
import com.icapglobal.timetracker.repository.TimeSheetObjectRepository;
import com.icapglobal.timetracker.services.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private TimeSheetService timeSheetService;

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @RequestMapping("/employeeview")
    public String editTimeSheet(TimeSheetObject timesheet) {
//        timeSheetService.calculateTotalBalance(timesheet);
//        timeSheetService.vacationDaysUsedTotal(timesheet);
//        timeSheetObjectRepository.save(timesheet);
        

        return "employeeview";
    }

    @RequestMapping("/supervisorview")
    public String approveTimeSheets() {

        return "supervisorview";
    }

    @RequestMapping("/hrmanagerview")
    public String finalApproval() {

        return "hrmanagerview";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {

        return "Submitted For Approval";
    }

    @RequestMapping("/approved")
    @ResponseBody
    public String approved() {

        return "Successfully approved";
    }

}
