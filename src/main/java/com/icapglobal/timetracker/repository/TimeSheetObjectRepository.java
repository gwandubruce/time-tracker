/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker.repository;

import com.icapglobal.timetracker.models.TimeSheetObject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Bruce Gwandu
 */
public interface TimeSheetObjectRepository extends JpaRepository<TimeSheetObject, Integer> {
    
}
