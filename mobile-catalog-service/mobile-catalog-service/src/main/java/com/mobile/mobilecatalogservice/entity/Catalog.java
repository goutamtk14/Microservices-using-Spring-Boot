package com.mobile.mobilecatalogservice.entity;

import java.util.ArrayList;

public class Catalog {
	
	int userid;
	String username;
	long usermobileno;
	ArrayList<Rating> ratings=new ArrayList<>();
	
	

	public Catalog(int userid, String username, long usermobileno, ArrayList<Rating> ratings) {
		super();
		this.userid = userid;
		this.username = username;
		this.usermobileno = usermobileno;
		this.ratings = ratings;
	}
	public ArrayList<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(ArrayList<Rating> ratings) {
		this.ratings = ratings;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public long getUsermobileno() {
		return usermobileno;
	}
	public void setUsermobileno(long usermobileno) {
		this.usermobileno = usermobileno;
	}

	public Catalog() {
		super();
	}
	@Override
	public String toString() {
		return "Catalog [userid=" + userid + ", username=" + username + ", usermobileno=" + usermobileno + ", ratings="
				+ ratings + "]";
	}

	

}
