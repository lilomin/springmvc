package com.perficient.web.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perficient.pojo.Blog;
import com.perficient.service.BlogService;

@Controller
public class BlogController {

	List<Blog> blogList = null;
	
	@Resource
	BlogService blogService;
	
	@RequestMapping("/allBlogs")
	private void getAllBlogs(HttpServletResponse response){
		try {
			System.out.println("getAllBlogs");
			blogList = blogService.getAllBlogs();
			JSONArray blogArray = new JSONArray();
			for(Blog blog: blogList){
				JSONObject blogJson = new JSONObject(blog);
				System.out.println("json:"+blogJson);
				blogArray.put(blogJson);
			}
			response.getWriter().print(blogArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
		response.setStatus(200);
	}
	
	@RequestMapping("/submitBlog")
	private void getSubmitedBlog(@RequestBody String data, HttpServletResponse response){
		try {
			System.out.println("add blog"+data);
			JSONObject blogJSON = new JSONObject(data);
			blogService.addBlog(blogJSON);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		response.setStatus(200);
		
	}
}
