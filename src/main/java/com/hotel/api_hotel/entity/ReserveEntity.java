package com.hotel.api_hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "reserve")
public class ReserveEntity implements Serializable {

    @Id
    @Column(name = "reserve_id")
    private long id;

    @Column(name = "room_id")
    private long roomId;

    @Column(name = "dni_client")
    private String dniClient;

    @Column(name = "date_in")
    private String dateIn;

    @Column(name = "date_out")
    private String dateOut;


}
