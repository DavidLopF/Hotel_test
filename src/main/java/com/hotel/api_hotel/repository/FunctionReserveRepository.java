package com.hotel.api_hotel.repository;

import com.hotel.api_hotel.entity.functions.FunctionEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface FunctionReserveRepository extends CrudRepository<FunctionEntity, Integer> {

    @Query(value = "SELECT * FROM do_reserve(:dateIn, :dateOut, :dniClient, :roomId)", nativeQuery = true)
    FunctionEntity callDoReserve(@Param("dateIn") String dateIn, @Param("dateOut") String dateOut, @Param("dniClient") String dniClient, @Param("roomId") Integer roomId);


}
