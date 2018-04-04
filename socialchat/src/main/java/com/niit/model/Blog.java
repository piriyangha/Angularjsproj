package com.niit.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity

public class Blog {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	private int blogid;
	private String blogname;
	private String blogcontent;
   @ManyToOne(fetch= FetchType.EAGER,cascade=CascadeType.ALL)
	private User postby;
	private String status;
	private Date createdate;
	private int likes;
	
	
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getBlogname() {
		return blogname;
	}
	public void setBlogname(String blogname) {
		this.blogname = blogname;
	}
	public String getBlogcontent() {
		return blogcontent;
	}
	public void setBlogcontent(String blogcontent) {
		this.blogcontent = blogcontent;
	}
	
	public User getPostby() {
		return postby;
	}
	public void setPostby(User postby) {
		this.postby = postby;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	
	

}
