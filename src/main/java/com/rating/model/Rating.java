package com.rating.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="user_ratings")
public class Rating {
    @Id
	private String ratingId;
	private String userId;
	private String movieId;
	private int rating;
	private String review;
}
