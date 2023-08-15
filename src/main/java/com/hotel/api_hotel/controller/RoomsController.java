package com.hotel.api_hotel.controller;

import com.hotel.api_hotel.dto.GeneralResponseDTO;
import com.hotel.api_hotel.repository.RoomRepository;
import com.hotel.api_hotel.repository.RoomsInformationViewRepository;
import com.hotel.api_hotel.service.room.RoomsServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class RoomsController {


    @Autowired
    private RoomsServiceImpl roomsService;

    @GetMapping(value = "/rooms", produces = "application/json")
    public ResponseEntity<GeneralResponseDTO> getRooms() {
        log.info("************ INICIO DE CONSULTA DE ROOMS ************");
        GeneralResponseDTO response = new GeneralResponseDTO();
        try {


            response.setData(roomsService.getAll());
            response.setStatus("SUCCESS");
            response.setMessage("Se encontraron los siguientes rooms");
            log.info("************ FIN DE CONSULTA DE ROOMS ************");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error("************ ERROR AL CONSULTAR ROOMS ************");
            response.setStatus("ERROR");
            response.setMessage("No se encontraron rooms");

            return null;
        }

    }



}
