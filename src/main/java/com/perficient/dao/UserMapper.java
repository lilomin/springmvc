package com.perficient.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.perficient.pojo.User;

public interface UserMapper {
	public List<User> getAllUser();
	
	@Select("SELECT * FROM user WHERE id = #{userId} ")
	public User getUser(@Param("userId") String userId);
	public int addUser(User user);
}
