package com.hotel.api_hotel.service.hotel;

import com.hotel.api_hotel.entity.tables.HotelEntityWithUbication;

import java.util.List;

public interface HotelService  {

    public List<HotelEntityWithUbication> getAll();
}
