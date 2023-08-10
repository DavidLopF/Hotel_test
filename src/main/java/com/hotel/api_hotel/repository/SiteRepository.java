package com.hotel.api_hotel.repository;

import com.hotel.api_hotel.entity.SiteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SiteRepository extends CrudRepository<SiteEntity, Integer> {

    SiteEntity save(SiteEntity siteEntity);

    List<SiteEntity> findAll();
}
