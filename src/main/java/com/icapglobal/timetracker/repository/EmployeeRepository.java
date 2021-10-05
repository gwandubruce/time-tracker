/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker.repository;

import com.icapglobal.timetracker.models.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruce Gwandu
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    Optional<Employee>  findByUsername(String username);
    
}
