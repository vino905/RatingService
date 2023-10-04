package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.model.Rating;
import com.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	// create rating
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		Rating res= ratingService.create(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(res);
	}
	
	// for getting all the ratings
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings(){
		List<Rating> res= ratingService.getRatings();
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	// for getting rating By User Id
	@GetMapping("/getByuserId/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingByUserId( @PathVariable String userId){
		List<Rating> res= ratingService.getRatingsByUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	
	// for getting rating By Movie Id
	@GetMapping("/getByMovieId/{movieId}")
	public ResponseEntity<List<Rating>> getAllRatingByMovieId(@PathVariable String movieId ){
		List<Rating> res= ratingService.getRatingsByMoveiId(movieId);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
}
