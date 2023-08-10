package com.hotel.api_hotel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class GeneralResponseDTO implements Serializable {

    private Object data;
    private String status;
    private String message;

}
