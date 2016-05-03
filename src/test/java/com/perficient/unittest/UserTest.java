package com.perficient.unittest;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.perficient.pojo.Blog;
import com.perficient.pojo.User;
import com.perficient.service.BlogService;
import com.perficient.service.impl.UserServiceImpl;

public class UserTest {
	private ApplicationContext ac = null;
	
	@Resource
	private UserServiceImpl userService = null;
	private BlogService blogService = null;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("spring/applicationContext-servlet.xml");
		userService = (UserServiceImpl) ac.getBean("UserService");
		blogService = (BlogService) ac.getBean("BlogService");
	}
	
	@Test
	public void test1(){
		User user = userService.getUser(1);
		System.out.println(user.toString());
	}
	
	@Test
	public void testGetAllUser(){
		List<User> users = userService.getAllUsers();
		System.out.println(users.size());
		for(User user: users){
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void testGetUserByName(){
		User user = userService.getUserByName("raymond");
		System.out.println(user.toString());
	}
	
	@Test
	public void testGetAllBlog(){
		List<Blog> blogs = blogService.getAllBlogs();
		System.out.println(blogs.size());
		for(Blog blog: blogs){
			System.out.println(blog.toString());
		}
	}
}
