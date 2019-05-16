package com.slk.goutam.ratingsservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slk.goutam.ratingsservice.entity.Ratings;

public interface RatingsRepository extends JpaRepository<Ratings, Integer>{
	
	public List<Ratings> findByUserid(int userid);

}
