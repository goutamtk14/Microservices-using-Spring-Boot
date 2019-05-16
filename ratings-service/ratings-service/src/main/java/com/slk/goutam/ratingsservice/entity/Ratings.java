package com.slk.goutam.ratingsservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ratings {
	
	@Id
	int id;
	int userid;
	int mobileid;
	int rating;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
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
	public Ratings(int userid, int mobileid, int rating) {
		super();
		this.userid = userid;
		this.mobileid = mobileid;
		this.rating = rating;
	}
	public Ratings() {
		super();
	}

}
