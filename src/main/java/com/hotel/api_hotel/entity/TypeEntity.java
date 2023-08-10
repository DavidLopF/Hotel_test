package com.hotel.api_hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "type")
public class TypeEntity implements Serializable {

    @Id
    @Column
    private long id;

    @Column
    private String name;
}
