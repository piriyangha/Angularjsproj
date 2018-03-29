package com.niit.dao;

import com.niit.model.User;



public interface UserDao {
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	}
