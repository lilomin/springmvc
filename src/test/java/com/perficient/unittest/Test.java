package com.perficient.unittest;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.perficient.pojo.User;
import com.perficient.service.impl.FooServiceImpl;

public class Test {
	private ApplicationContext ac = null;
	
	@Resource
	private FooServiceImpl fService = null;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("spring/applicationContext-servlet.xml");
		fService = (FooServiceImpl) ac.getBean("FooService");
	}
	
	@org.junit.Test
	public void test1(){
		User user = fService.doSomeBusniess(1);
		System.out.println(user.toString());
	}
	
	@org.junit.Test
	public void testGetAllUser(){
		List<User> users = fService.getAllUsers();
		System.out.println(users.size());
		for(User user: users){
			System.out.println(user.toString());
		}
	}
}
