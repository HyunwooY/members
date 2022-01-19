package com.jhta.practice.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@Autowired private ServletContext sc;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("cp",sc.getContextPath());
		return "home";
	}
}
