package com.hotel.api_hotel.service.room;

import com.hotel.api_hotel.entity.RoomsInformationViewEntity;
import com.hotel.api_hotel.repository.RoomsInformationViewRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class RoomsServiceImpl implements RoomService {

    @Autowired
    private RoomsInformationViewRepository roomsInformationViewRepository;

    @Override
    public List<RoomsInformationViewEntity> getAll() {
        log.info("***** RoomsServiceImpl.getAll() *****");
        List<RoomsInformationViewEntity> roomsInformationViewEntities = roomsInformationViewRepository.findAll();
        try{
            if (roomsInformationViewEntities.isEmpty()) {
                log.info("***** RoomsServiceImpl.getAll() -> roomsInformationViewEntities.isEmpty() *****");
                return null;
            }
            return roomsInformationViewEntities;
        }catch (Exception e){
            log.error("***** RoomsServiceImpl.getAll() -> ERROR: " + e.getMessage() + " *****");
            return null;
        }

    }
}
