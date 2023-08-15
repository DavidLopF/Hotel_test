package com.hotel.api_hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "hotel_with_ubication")
public class HotelEntityWithUbication implements Serializable {

    @Id
    @Column(name = "hotel_id")
    private long id;

    @Column(name = "site_id")
    private long siteId;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "number_rooms")
    private int numberRooms;

    @Column(name = "site_name")
    private String ubication;
}
