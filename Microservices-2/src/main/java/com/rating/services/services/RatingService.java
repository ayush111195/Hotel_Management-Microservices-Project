package com.rating.services.services;

import java.util.List;

import com.rating.services.entites.Rating;

public interface RatingService {

	//create---->>>
	
	Rating create (Rating rating);
	
	// get all rating ----->>>
	
	List<Rating>getAllRating();
	
	// get all by userid---->>>
	
	List<Rating>getAllByUserid(String userId);
	
	// get all by hotelid---->>>
	
	List<Rating>getAllByHotelId(String hotelId);
}
