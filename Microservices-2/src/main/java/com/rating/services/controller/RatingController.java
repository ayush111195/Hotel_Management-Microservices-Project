package com.rating.services.controller;

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

import com.rating.services.entites.Rating;
import com.rating.services.services.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService  ratingService;

	// create--->>>
	
	@PostMapping("/")
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
		
	}
	
	//getAll--->>>
	
	@GetMapping("/all")
	public ResponseEntity<List<Rating>> getAll( ){
		return ResponseEntity.ok(ratingService.getAllRating());
		
	}
	
	//getAllByUserId---->>>
	
	@GetMapping("/user{userId}")
	public ResponseEntity<List<Rating>> getAllByUserId(@PathVariable String userId ){
		return ResponseEntity.ok(ratingService.getAllByUserid(userId));
}
	//getAllByHotelId---->>>
	
		@GetMapping("/hotel{hotelId}")
		public ResponseEntity<List<Rating>> getAllByHotelId(@PathVariable String hotelId ){
			return ResponseEntity.ok(ratingService.getAllByUserid(hotelId));
	}
	
}