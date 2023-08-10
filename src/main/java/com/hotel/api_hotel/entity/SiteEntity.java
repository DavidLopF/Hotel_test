package com.hotel.api_hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Table(name = "site")
public class SiteEntity implements Serializable {

    @Id
    @Column(name = "site_id")
    private long id;

    @Column(name = "site_name")
    private String name;

}
