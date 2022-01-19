package com.jhta.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jhta.practice.service.MembersService;
import com.jhta.practice.vo.MembersVo;

@Controller
public class InsertController {
	@Autowired private MembersService service;
	
	@GetMapping("/members/insert")
	public String insertForm() {
		return "insert";
	}
	
	@PostMapping("/members/insert")
	public String insert(MembersVo vo, Model model) {
		try {
			service.insert(vo);
			model.addAttribute("result","success");
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("result","fail");
		}
		return "home";
	}
}






