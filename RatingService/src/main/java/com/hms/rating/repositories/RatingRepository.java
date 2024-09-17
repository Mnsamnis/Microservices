package com.hms.rating.repositories;

import com.hms.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

    @Query("{ 'userId' : ?0 }")
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);

}
