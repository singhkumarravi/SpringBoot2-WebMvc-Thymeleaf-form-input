package com.olive.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.olive.model.Employee;

@Controller
public class EmpController {

	@GetMapping("/")
	private String showReg(Model model) {
		model.addAttribute("emp",new Employee());
		return "register";
	}
	
	@PostMapping("/reg/save")
	private String saveData(@ModelAttribute Employee emp,Model model) {
		
		System.out.println(" Data :: " + emp);
		
		model.addAttribute("data", emp);
		return "show";
	}
	
}
