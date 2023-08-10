package com.hotel.api_hotel.repository;

import com.hotel.api_hotel.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomEntity, Integer> {

    RoomEntity save(RoomEntity roomEntity);

}
