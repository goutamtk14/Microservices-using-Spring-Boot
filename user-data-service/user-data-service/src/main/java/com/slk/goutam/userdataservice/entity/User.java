package com.slk.goutam.userdataservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
@Id
int userid;
String username;
long usermobileno;
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
public User(int userid, String username, long usermobileno) {
	super();
	this.userid = userid;
	this.username = username;
	this.usermobileno = usermobileno;
}
public User() {
	super();
}

	
}
