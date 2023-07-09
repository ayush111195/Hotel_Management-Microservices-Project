package com.rating.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.services.entites.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>   {

	List<Rating> findByHotelId(String hotelId);
	
	List<Rating> findByUserId(String userId);
	
}
