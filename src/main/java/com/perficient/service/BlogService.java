package com.perficient.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.perficient.dao.BlogMapper;
import com.perficient.pojo.Blog;

@Service("BlogService")
@Component
public class BlogService{
	
	@Resource
	private BlogMapper blogMapper;
	
	public List<Blog> getAllBlogs() {
		return blogMapper.getAllBlogs();
	}

	public Blog getBlogById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addBlog(JSONObject json) {
		try {
			Blog newBlog = new Blog();
			newBlog.setTitle(json.getString("title"));
			newBlog.setContent(json.getString("content"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(json.getString("submitDate"));
			newBlog.setSubmitDate(date);
			blogMapper.addBlog(newBlog);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
