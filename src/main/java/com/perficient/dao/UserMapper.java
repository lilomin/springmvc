package com.perficient.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.perficient.pojo.User;

public interface UserMapper {
	public List<User> getAllUsers();
	public User getUser(@Param("userId") int userId);
	public User getUserByName(@Param("name") String username);
}
