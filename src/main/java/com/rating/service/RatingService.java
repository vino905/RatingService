package com.rating.service;

import java.util.List;

import com.rating.model.Rating;

public interface RatingService {

	// for creating the rating
	Rating create (Rating rating);
	
	// get all ratings 
	List<Rating> getRatings();
	
	// get all ratings by userID
	List<Rating> getRatingsByUserId(String userId);
	
	// get all raings by movie
	List<Rating> getRatingsByMoveiId(String movieId);
}
