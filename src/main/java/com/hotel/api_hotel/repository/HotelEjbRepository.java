package com.hotel.api_hotel.repository;

import com.hotel.api_hotel.entity.HotelEntityWithUbication;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelEjbRepository extends CrudRepository<HotelEntityWithUbication, Integer> {

    List<HotelEntityWithUbication> findAll();


}
