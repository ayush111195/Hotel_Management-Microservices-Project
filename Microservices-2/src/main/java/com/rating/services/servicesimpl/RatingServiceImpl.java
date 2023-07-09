package com.rating.services.servicesimpl;

import java.util.List;
import java.util.UUID;

import org.hibernate.id.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.services.entites.Rating;
import com.rating.services.repository.RatingRepository;
import com.rating.services.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
		
		String randomRatingId = UUID.randomUUID().toString();
		rating.setRatingId(randomRatingId);
		
		return ratingRepository.save(rating) ;
	}

	@Override
	public List<Rating> getAllRating() {
		
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getAllByUserid(String userId) {
		
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getAllByHotelId(String hotelId) {
		
		return ratingRepository.findByHotelId(hotelId);
	}

}
