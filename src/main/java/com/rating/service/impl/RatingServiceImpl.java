package com.rating.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.model.Rating;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepo;
	
	@Override
	public Rating create(Rating rating) {
		String randomRatingrId= UUID.randomUUID().toString();
		rating.setRatingId(randomRatingrId);
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
	
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingsByUserId(String userId) {
	
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingsByMoveiId(String movieId) {
	
		return ratingRepo.findByMovieId(movieId);
	}

}
