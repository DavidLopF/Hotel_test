package com.hotel.api_hotel.controller;

import com.hotel.api_hotel.dto.GeneralResponseDTO;
import com.hotel.api_hotel.dto.ReserveRequestDTO;

import com.hotel.api_hotel.entity.tables.ReserveEntity;
import com.hotel.api_hotel.service.reserve.ReserveServiceImpl;
import com.hotel.api_hotel.util.Util;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
@Log4j2
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReserveController {

    @Autowired
    private ReserveServiceImpl reserveService;


    @PostMapping(value = "/saveReserve", produces = "application/json", consumes = "application/json")
    public ResponseEntity<GeneralResponseDTO> saveReserve(@Valid @RequestBody ReserveRequestDTO request, BindingResult results) {
        log.info("************ INICIO GUARDADO DE RESERVAS ************");
        GeneralResponseDTO response = new GeneralResponseDTO();
        if (results.hasErrors()) {
            response.setMessage("Error en el request: " + Util.getJson(Util.fieldsValidator(results)));
            log.info("************ FIN GUARDADO DE RESERVAS ************");
            return ResponseEntity.badRequest().body(response);
        }
        response = reserveService.saveReserve(request);
        log.info("el response es: " + response.toString());
        if(!response.getStatus().equals("200")){
            log.info("************ FIN GUARDADO DE RESERVAS ************");
            return ResponseEntity.badRequest().body(response);
        }
        return null;
    }

}
