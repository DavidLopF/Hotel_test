package com.hotel.api_hotel.repository;

import com.hotel.api_hotel.entity.RoomsInformationViewEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomsInformationViewRepository extends CrudRepository<RoomsInformationViewEntity, Integer> {
    List<RoomsInformationViewEntity> findAll();
}
