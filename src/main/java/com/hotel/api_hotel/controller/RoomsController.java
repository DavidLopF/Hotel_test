package com.hotel.api_hotel.controller;

import com.hotel.api_hotel.dto.GeneralResponseDTO;
import com.hotel.api_hotel.entity.tables.RoomsInformationViewEntity;
import com.hotel.api_hotel.service.room.RoomsServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@CrossOrigin(origins = "*", allowedHeaders = "*")
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

            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping(value = "/roomsByIdSite", produces = "application/json")
    public ResponseEntity<GeneralResponseDTO> getRoomsByIdSite(@RequestParam Integer idSite) {
        log.info("************ INICIO DE CONSULTA DE ROOMS ************");
        GeneralResponseDTO response = new GeneralResponseDTO();
        try {
            List<RoomsInformationViewEntity> rooms = roomsService.getAllByHotelId(idSite);
            if (rooms == null) {
                response.setStatus("ERROR");
                response.setMessage("No se encontraron rooms");
                log.info("************ FIN DE CONSULTA DE ROOMS ************");
                return ResponseEntity.badRequest().body(response);
            }
            response.setData(rooms);
            response.setStatus("SUCCESS");
            response.setMessage("Se encontraron los siguientes rooms");
            log.info("************ FIN DE CONSULTA DE ROOMS ************");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error("************ ERROR AL CONSULTAR ROOMS ************");
            response.setStatus("ERROR");
            response.setMessage("No se encontraron rooms");

            return ResponseEntity.badRequest().body(response);
        }
    }


}
