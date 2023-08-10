package com.hotel.api_hotel.controller;

import com.hotel.api_hotel.entity.RoomEntity;
import com.hotel.api_hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class roomsController {

    @Autowired
    private RoomRepository roomRepository;



}
