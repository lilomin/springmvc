package com.perficient.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

	@RequestMapping("/submitBlog")
	private void getSubmitedBlog(@RequestBody String html, HttpServletResponse response){
		try {
			System.out.println("blog"+html);
			response.setStatus(200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
