package com.perficient.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.perficient.pojo.Items;

public class ItemsController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		List<Items> itemsList = new ArrayList<Items>();
		Items item = new Items();
		item.setName("Apple iphone");
		item.setPrice(6088f);
		item.setDetail("Apple iphone6s mobile phone");
		itemsList.add(item);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("itemsList");
		return modelAndView;
	}

}
