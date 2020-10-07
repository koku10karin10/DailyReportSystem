package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.service.TestService;


@Controller
public class EmployeeController {
	
	@Autowired
	TestService ts;
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("tl", ts.getTestAll());
		return "test";
	}

}
