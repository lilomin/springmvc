package com.perficient.web.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.perficient.pojo.User;
import com.perficient.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Resource(name="UserService")
	private UserServiceImpl userService;
	
	@RequestMapping("/index")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model){
		Object currentUser = request.getSession().getAttribute("currentUser");
		if(currentUser != null){
			model.addAttribute("username", currentUser.toString());
		}
		return "index";
	}

	@RequestMapping("/login")
	public void validateUser(@RequestParam("username") String username,
		@RequestParam("pwd") String pwd, HttpServletRequest request, HttpServletResponse response, Model model){
		try {
			model.addAttribute("username", username);
			User loginUser = userService.getUserByName(username);
			if(loginUser != null){
				String currentURL = request.getRequestURL().toString();
				System.out.println("current:"+currentURL);
				request.getSession().setAttribute("currentUser", username);
				response.sendRedirect("items");
				//return "itemsList";
			} else {
				//return "index";
				response.sendRedirect("index");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
