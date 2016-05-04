package com.perficient.dao;

import java.util.List;

import com.perficient.pojo.Blog;

public interface BlogMapper {
	public List<Blog> getAllBlogs();
	public Blog getBlogById();
	public void addBlog(Blog blog);
}
