package com.hotel.api_hotel.dto.reserveDTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseSuccesDTO implements Serializable{

    private ReserveDTO message;
}
