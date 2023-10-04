package com.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.model.Rating;

public interface RatingRepository  extends JpaRepository<Rating, String>{

	//custom  finder methods
	
	//for getting rating by userId
	List<Rating> findByUserId(String userId);
	
	//for getting rating by movieId
	List<Rating> findByMovieId(String movieId);
	
}
