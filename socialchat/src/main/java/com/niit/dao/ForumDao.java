package com.niit.dao;

import java.util.List;

import com.niit.model.Forum;
import com.niit.model.ForumComment;

public interface ForumDao {
	
		public boolean addForum(Forum forum);
		public boolean deleteForum(Forum forum);
		public boolean updateForum(Forum forum);
		public Forum getForum(int fid);
		public boolean approveForum(Forum forum);
		public boolean rejectForum(Forum forum);
		public List<Forum> listForum(String username);
		public boolean addForumComment(ForumComment forumComment);
		public boolean deleteForumComment(ForumComment forumComment);
		public ForumComment getForumComment(int commentId);
		public List<ForumComment> listForumComments(int forumId);
	}



