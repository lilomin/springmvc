package com.perficient.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.perficient.dao.BlogMapper;
import com.perficient.dao.UserMapper;
import com.perficient.pojo.Blog;
import com.perficient.pojo.User;
import com.perficient.service.UserService;

@Service("BlogService")
@Component
public class BlogService implements BlogMapper {
	
	@Resource
	private BlogMapper blogMapper;
	
	public List<Blog> getAllBlogs() {
		return blogMapper.getAllBlogs();
	}

	public Blog getBlogById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addBlog() {
		// TODO Auto-generated method stub
		
	}

}
