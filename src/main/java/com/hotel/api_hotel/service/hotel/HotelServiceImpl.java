package com.hotel.api_hotel.service.hotel;

import com.hotel.api_hotel.entity.tables.HotelEntityWithUbication;
import com.hotel.api_hotel.repository.HotelEjbRepository;
import com.hotel.api_hotel.repository.HotelRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private HotelEjbRepository hotelEjbRepository;

    @Override
    public List<HotelEntityWithUbication> getAll() {

        log.info("***** HotelServiceImpl.getAll() *****");


        try{
            List<HotelEntityWithUbication > hotelEntities = hotelEjbRepository.findAll();
            if (hotelEntities.isEmpty()) {
                log.info("***** HotelServiceImpl.getAll() -> hotelEntities.isEmpty() *****");
                return null;
            }
            return hotelEntities;
        }catch (Exception e){
            log.error("***** HotelServiceImpl.getAll() -> ERROR: " + e.getMessage() + " *****");
            return null;
        }

    }
}
