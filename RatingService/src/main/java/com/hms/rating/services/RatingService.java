package com.hms.rating.services;


import com.hms.rating.entities.Rating;
import com.hms.rating.repositories.RatingRepository;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //getAllRatings
    List<Rating> getRatings();


    //getAllByUserId
    List<Rating> getRatingByUserId(String userId);

    //getAllByHotel
    List<Rating> getRatingByHotelId(String hotelId);
}
