package com.perficient.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/index")
	public String login(){
		return "index";
	}

	@RequestMapping("/login")
	public String validateUser(@RequestParam("username") String username,
			@RequestParam("pwd") String pwd, Model model) {
		model.addAttribute("username", username);
		if(pwd == ""){
			return "itemsList";
		} else {
			return "index";
		}
	}

}
