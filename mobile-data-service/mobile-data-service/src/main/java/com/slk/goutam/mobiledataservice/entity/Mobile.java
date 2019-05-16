package com.slk.goutam.mobiledataservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	
	@Id
	int mobileid;
	String mobilename;
	double mobileprice;
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public double getMobileprice() {
		return mobileprice;
	}
	public void setMobileprice(double mobileprice) {
		this.mobileprice = mobileprice;
	}
	public Mobile(int mobileid, String mobilename, double mobileprice) {
		super();
		this.mobileid = mobileid;
		this.mobilename = mobilename;
		this.mobileprice = mobileprice;
	}
	public Mobile() {
		super();
	}
}
