package com.perficient.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/index")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model){
		Object currentUser = request.getSession().getAttribute("currentUser");
		if(currentUser != null){
			model.addAttribute("username", currentUser.toString());
		}
		return "index";
	}

	@RequestMapping("/login")
	public String validateUser(@RequestParam("username") String username,
		@RequestParam("pwd") String pwd, HttpServletRequest request, HttpServletResponse response, Model model) {
		
		model.addAttribute("username", username);
		if("admin".equals(username) && "admin".equals(pwd)){
			String currentURL = request.getRequestURL().toString();
			System.out.println("current:"+currentURL);
			request.getSession().setAttribute("currentUser", username);
			return "itemsList";
		} else {
			return "index";
		}
	}

}
