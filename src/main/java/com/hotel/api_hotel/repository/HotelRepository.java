package com.hotel.api_hotel.repository;

import com.hotel.api_hotel.entity.HotelEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelRepository extends CrudRepository<HotelEntity, Integer> {



}
