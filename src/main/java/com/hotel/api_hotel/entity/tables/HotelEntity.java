package com.hotel.api_hotel.entity.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "hotel")
public class HotelEntity implements Serializable {

    @Id
    @Column(name = "hotel_id")
    private long id;

    @Column(name = "site_id")
    private long siteId;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "number_rooms")
    private int numberRooms;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "description")
    private String description;
}
