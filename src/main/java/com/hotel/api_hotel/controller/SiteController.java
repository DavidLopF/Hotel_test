package com.hotel.api_hotel.controller;

import com.hotel.api_hotel.dto.GeneralResponseDTO;
import com.hotel.api_hotel.service.site.SiteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class SiteController {

    @Autowired
    private SiteService siteService;

    @GetMapping(value = "/getSites", produces = "application/json")
    public ResponseEntity<GeneralResponseDTO> getSites() {
        log.info("************ INICIO DE CONSULTA DE SITES ************");
        try {
            GeneralResponseDTO response = new GeneralResponseDTO();
            response.setData(siteService.getAll());
            response.setStatus("SUCCESS");
            response.setMessage("Se encontraron los siguientes sites");
            log.info("************ FIN DE CONSULTA DE SITES ************");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            log.error("************ ERROR AL CONSULTAR SITES ************");
            return null;
        }
    }
}
