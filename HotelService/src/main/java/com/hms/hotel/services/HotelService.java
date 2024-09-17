package com.hms.hotel.services;

import com.hms.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel create(Hotel hotel);

    //get_all
    List<Hotel> getAll();

    //get_single
    Hotel get(String id);
}
