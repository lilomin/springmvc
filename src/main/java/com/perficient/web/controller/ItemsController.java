package com.perficient.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ItemsController{

	@RequestMapping("/items")
	public String showItemsList(HttpServletRequest request, HttpServletResponse response, Model model){
		return "itemsList";
	}
}
