package com.hotel.api_hotel.entity.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "roomsinformation")
public class RoomsInformationViewEntity {

    @Id
    @Column(name = "room_id")
    private long id;

    @Column(name = "available")
    private int available;

    @Column(name = "id_hotel")
    private long idHotel;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "price")
    private int price;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "site_id")
    private long siteId;

    @Column(name = "tiponame")
    private String typeName;

    @Column(name = "site_name")
    private String ubication;

    @Column(name = "capacityhotel")
    private int capacityHotel;




}
