package com.perficient.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.perficient.pojo.User;

@Repository
public interface UserMapper {
	public List<User> getAllUser();
	public User getUser(int id);
	public int addUser(User user);
}
