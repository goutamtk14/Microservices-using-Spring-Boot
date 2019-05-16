package com.slk.goutam.ratingsservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slk.goutam.ratingsservice.entity.Ratings;
import com.slk.goutam.ratingsservice.repository.RatingsRepository;

@Service
public class RatingService {
	
	@Autowired
	RatingsRepository repo;

	public List<Ratings> getRatings(String userId){
		int userid=Integer.parseInt(userId);
		List<Ratings> ratings=repo.findByUserid(userid);
		return ratings;
	}
	
}
