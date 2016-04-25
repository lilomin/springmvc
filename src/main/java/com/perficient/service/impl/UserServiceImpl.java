package com.perficient.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.perficient.dao.UserMapper;
import com.perficient.pojo.User;
import com.perficient.service.UserService;

@Service("UserService")
@Component
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public User getUser(int userId){
		return this.userMapper.getUser(userId);
	}
	
	public List<User> getAllUsers(){
		return userMapper.getAllUsers();
	}
	
	public User getUserByName(String name){
		return userMapper.getUserByName(name);
	}

}
