package com.hotel.api_hotel.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "rooms")
public class RoomEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private long id;

    @Column(name = "site_id")
    private long siteId;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "available")
    private int available;

    @Column(name = "price")
    private int price;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "id_hotel")
    private long idHotel;

}
