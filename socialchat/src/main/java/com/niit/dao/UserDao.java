package com.niit.dao;

import java.util.List;

import com.niit.model.User;




public interface UserDao {
	public boolean registerUser(User userDetail);
	public User checkLogin(User user);
	//public boolean updateOnlineStatus(String status,User userDetail);
	public User getUser(String loginname);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	public List<User> listUsers();
	public User getUserByEmail(String email); 
	}
