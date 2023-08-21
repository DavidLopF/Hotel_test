package com.hotel.api_hotel.repository;

import com.hotel.api_hotel.entity.tables.RoomsInformationViewEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomsInformationViewRepository extends CrudRepository<RoomsInformationViewEntity, Integer> {
    List<RoomsInformationViewEntity> findAll();

    @Query(value = "SELECT * FROM roomsinformation WHERE site_id = ?1", nativeQuery = true)
    List<RoomsInformationViewEntity> findAllByHotelId(long hotelId);
}
