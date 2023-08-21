package com.hotel.api_hotel.dto.reserveDTO;


import lombok.Data;

import java.io.Serializable;

@Data
public class ReserveDTO implements Serializable {


    private long reserve_id;

    private long roomId;

    private String dniClient;

    private String dateIn;

    private String dateOut;
}

