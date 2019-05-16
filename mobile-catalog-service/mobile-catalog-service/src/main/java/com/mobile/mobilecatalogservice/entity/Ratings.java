package com.mobile.mobilecatalogservice.entity;

public class Ratings {
	int id;
	int userid;
	int mobileid;
	int rating;
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public Ratings() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Ratings(int id, int userid, int mobileid, int rating) {
		super();
		this.id = id;
		this.userid = userid;
		this.mobileid = mobileid;
		this.rating = rating;
	}
	

}
