package com.perficient.service.impl;

import org.springframework.stereotype.Service;

import com.perficient.dao.UserMapper;
import com.perficient.pojo.User;
import com.perficient.service.FooService;

@Service
public class FooServiceImpl implements FooService {
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper){
		System.out.println("usermapper:"+userMapper);
		this.userMapper = userMapper;
	}
	
	public User doSomeBusniess(String userId){
		return this.userMapper.getUser(userId);
	}
}
