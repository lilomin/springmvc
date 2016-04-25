package com.perficient.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.perficient.dao.UserMapper;
import com.perficient.pojo.User;
import com.perficient.service.FooService;

@Service("FooService")
public class FooServiceImpl implements FooService {
	
	@Resource
	private UserMapper userMapper;
	
	public User doSomeBusniess(int userId){
		return this.userMapper.getUser(userId);
	}
	
	public List<User> getAllUsers(){
		return userMapper.getAllUser();
	}

}
