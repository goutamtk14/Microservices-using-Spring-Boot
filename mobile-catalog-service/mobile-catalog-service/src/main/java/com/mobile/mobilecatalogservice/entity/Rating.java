package com.mobile.mobilecatalogservice.entity;

public class Rating {
	String mobilename;
	double mobileprice;
	int rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Rating(String mobilename, double mobileprice, int rating) {
		super();
		this.mobilename = mobilename;
		this.mobileprice = mobileprice;
		this.rating = rating;
	}
	public Rating() {
		super();
	}
	@Override
	public String toString() {
		return "Rating [mobilename=" + mobilename + ", mobileprice=" + mobileprice + ", rating=" + rating + "]";
	}
	
	

}
