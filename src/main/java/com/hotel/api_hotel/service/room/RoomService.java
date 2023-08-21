package com.hotel.api_hotel.service.room;

import com.hotel.api_hotel.entity.tables.RoomsInformationViewEntity;

import java.util.List;

public interface RoomService {

     List<RoomsInformationViewEntity> getAll();

     List<RoomsInformationViewEntity> getAllByHotelId(long hotelId);
}
