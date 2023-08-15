package com.hotel.api_hotel.controller;

import com.hotel.api_hotel.dto.GeneralResponseDTO;
import com.hotel.api_hotel.entity.HotelEntity;
import com.hotel.api_hotel.entity.HotelEntityWithUbication;
import com.hotel.api_hotel.service.hotel.HotelServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelService;

    @GetMapping(value = "/getHotels", produces = "application/json")
    public ResponseEntity<GeneralResponseDTO> getHotel() {
        GeneralResponseDTO response = new GeneralResponseDTO();
        log.info("************ INICIO DE CONSULTA DE HOTELES ************");
        List<HotelEntityWithUbication> hotelEntities = hotelService.getAll();

        if(hotelEntities == null) {
            response.setStatus("ERROR");
            response.setMessage("No se encontraron hoteles");
            log.info("************ FIN DE CONSULTA DE HOTELES ************");
            return ResponseEntity.badRequest().body(response);
        }

        response.setData(hotelEntities);
        response.setStatus("SUCCESS");
        response.setMessage("Se encontraron los siguientes hoteles");
        log.info("************ FIN DE CONSULTA DE HOTELES ************");
        return ResponseEntity.ok(response);
    }



}
