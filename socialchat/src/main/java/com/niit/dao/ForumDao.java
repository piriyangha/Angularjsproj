package com.niit.dao;

import com.niit.model.Forum;

public interface ForumDao {
	
		public boolean addForum(Forum forum);
		public boolean deleteForum(Forum forum);
		public boolean updateForum(Forum forum);
		public Forum getForum(int fid);
		public boolean approveForum(Forum forum);
		public boolean rejectForum(Forum forum);
		//public List<Blog> listBlog(String username);
		

	}



