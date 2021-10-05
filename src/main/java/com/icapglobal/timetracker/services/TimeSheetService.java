/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker.services;

import com.icapglobal.timetracker.models.TimeSheetObject;
import com.icapglobal.timetracker.repository.EmployeeRepository;
import com.icapglobal.timetracker.repository.TimeSheetObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruce Gwandu
 */
@Service
public class TimeSheetService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private TimeSheetObjectRepository timeSheetObjectRepository;

    public void calculateTotalBalance(TimeSheetObject timesheet) {

        Integer newBalance = timesheet.getStartingBalance() + timesheet.getPlusDaysEarned() - timesheet.getMinusDaysUsed();
        timesheet.setNewBalance(newBalance);

        timeSheetObjectRepository.save(timesheet);

    }
    public void vacationDaysUsedTotal(TimeSheetObject timesheet) {

        Integer total = timesheet.getVacationDaysUsed();
        timesheet.setNewBalance(total);

        timeSheetObjectRepository.save(timesheet);

    }
}
