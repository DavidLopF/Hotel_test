package com.hotel.api_hotel.service.reserve;

import com.hotel.api_hotel.dto.GeneralResponseDTO;
import com.hotel.api_hotel.dto.ReserveRequestDTO;
import com.hotel.api_hotel.entity.tables.ReserveEntity;
import org.springframework.http.ResponseEntity;

public interface ReserveService {

    GeneralResponseDTO saveReserve(ReserveRequestDTO reserveRequestDTO);
}
