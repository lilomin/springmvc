package com.perficient.web.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
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
			System.out.println("List:"+blogList.toString());
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
	private void getSubmitedBlog(@RequestBody String html, HttpServletResponse response){
		try {
			System.out.println("blog"+html);
			response.setStatus(200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
