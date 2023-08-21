package com.hotel.api_hotel.entity.functions;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "do_reserve")
@Entity
@Data
public class FunctionEntity {

    @Column(name = "status")
    @Id
    private Integer status;

    @Column(name = "response")
    private String response;

}
