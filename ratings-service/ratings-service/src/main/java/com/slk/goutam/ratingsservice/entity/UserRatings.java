package com.slk.goutam.ratingsservice.entity;

import java.util.List;

public class UserRatings {

List<Ratings> ratings;

public List<Ratings> getRatings() {
	return ratings;
}

public void setRatings(List<Ratings> ratings) {
	this.ratings = ratings;
}

public UserRatings(List<Ratings> ratings) {
	super();
	this.ratings = ratings;
}

public UserRatings() {
	super();
}


}
