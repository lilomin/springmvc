package com.perficient.unittest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.perficient.dao.UserMapper;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext-servlet.xml");
		UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
		System.out.println("m:"+userMapper);
		System.out.println(userMapper.getUser("1"));
	}
}
