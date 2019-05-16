package com.slk.goutam.ratingsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slk.goutam.ratingsservice.entity.Ratings;
import com.slk.goutam.ratingsservice.entity.UserRatings;
import com.slk.goutam.ratingsservice.service.RatingService;

@RestController
public class ratingscontroller {
	
	@Autowired
	RatingService service;

	
	@RequestMapping("/{userid}")
	public UserRatings getRatings(@PathVariable("userid") String userid) {
		System.out.println("Ratings Called");
		List<Ratings> ratings=service.getRatings(userid);
		UserRatings u=new UserRatings();
		u.setRatings(ratings);
		return u;
		
		
	}
}
