/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker.security;

import com.icapglobal.timetracker.models.Employee;
import com.icapglobal.timetracker.repository.EmployeeRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Bruce Gwandu
 */
public class UserDetailsServiceImpl implements UserDetailsService{
    
     @Autowired
    private EmployeeRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Employee> user = userRepository.findByUsername(username);
        Employee usr = user.orElseThrow(() -> new UsernameNotFoundException("Wrong Credentials!"));
        return new UserDetailsImpl(usr);
    }
    
}
