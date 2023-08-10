package com.hotel.api_hotel.service.site;

import com.hotel.api_hotel.entity.SiteEntity;
import com.hotel.api_hotel.repository.SiteRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class SiteServiceImpl implements SiteService {

    @Autowired
    private SiteRepository siteRepository;

    @Override
    public List<SiteEntity> getAll() {
        log.info("************ INICIO DE SERVICIO DE SITES ************");
       try{
           List<SiteEntity> sites = siteRepository.findAll();

           if (sites.isEmpty()) {
               log.info("************ NO SE ENCONTRARON SITES ************");
               return null;
           } else {
               log.info("************ SE ENCONTRARON SITES ************");
               return sites;
           }
       }catch (Exception e){
           log.error("************ ERROR AL CONSULTAR SITES ************");
           return null;
       }
    }
}
