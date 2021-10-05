/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icapglobal.timetracker;

import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 *
 * @author Bruce Gwandu
 */
@RunWith(SpringRunner.class)
public class FrontEndWebPageTests {
    
    	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testHomePage() throws Exception{
		
		mockMvc.perform(get("/employeeview"))
		.andExpect(status().isOk())
		.andExpect(view().name("employeeview"))
		.andExpect(content().string(containsString("Tracker ...")));
	}
        @Test
	public void testHrManager() throws Exception{
		
		mockMvc.perform(get("/hrmanagerview"))
		.andExpect(status().isOk())
		.andExpect(view().name("hrmanagerview"))
		.andExpect(content().string(containsString("Tracker ...")));
	}
             @Test
	public void testManageDoorsScreen() throws Exception{
		
		mockMvc.perform(get("/approved"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Successfully ...")));
	}
    
}
