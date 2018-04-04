package com.niit.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class ForumComment {
	@Id
	@GeneratedValue
	private int fcommmentID;
    private String commentText;
	private String username;
	//private int forumId;
	@ManyToOne
	private Forum forum;
	private Date commentDate;
	
	public int getFcommmentID() {
		return fcommmentID;
	}
	public void setFcommmentID(int fcommmentID) {
		this.fcommmentID = fcommmentID;
	}
	
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
/*	public int getForumId() {
		return forumId;
	}
	public void setForumId(int forumId) {
		this.forumId = forumId;
	}*/
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public Forum getForum() {
		return forum;
	}
	public void setForum(Forum forum) {
		this.forum = forum;
	}
	


}
