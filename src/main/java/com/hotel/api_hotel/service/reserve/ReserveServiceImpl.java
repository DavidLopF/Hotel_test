package com.hotel.api_hotel.service.reserve;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.hotel.api_hotel.dto.GeneralResponseDTO;
import com.hotel.api_hotel.dto.ReserveRequestDTO;
import com.hotel.api_hotel.dto.reserveDTO.ResponseFailDTO;
import com.hotel.api_hotel.entity.functions.FunctionEntity;
import com.hotel.api_hotel.entity.tables.ReserveEntity;
import com.hotel.api_hotel.repository.FunctionReserveRepository;
import com.hotel.api_hotel.repository.ReserveRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ReserveServiceImpl implements ReserveService{

    @Autowired
    private ReserveRepository reserveRepository;

    @Autowired
    private FunctionReserveRepository functionReserveRepository;


    @Override
    public GeneralResponseDTO saveReserve(ReserveRequestDTO reserveRequestDTO) {
        try {
            GeneralResponseDTO response = new GeneralResponseDTO();
            FunctionEntity funcionEntity =  functionReserveRepository.callDoReserve(reserveRequestDTO.getDateIn(), reserveRequestDTO.getDateIn(), reserveRequestDTO.getDniClient(), reserveRequestDTO.getIdRoom());
            log.info("***** ReserveServiceImpl.saveReserve() -> funcionEntity: " + funcionEntity.toString() + " *****");
            JsonObject json = new JsonObject();
            if (funcionEntity.getStatus()!= 200){
                ResponseFailDTO failReserveResposeDTO = new ResponseFailDTO();
                ObjectMapper mapper = new ObjectMapper();
                failReserveResposeDTO = mapper.readValue(funcionEntity.getResponse(), ResponseFailDTO.class);
                response.setMessage(failReserveResposeDTO.getMessage());
                response.setStatus(String.valueOf(funcionEntity.getStatus()));
                return response;
            }
            response.setMessage("Reserva realizada correctamente");
            response.setStatus(String.valueOf(funcionEntity.getStatus()));

            ObjectMapper mapper = new ObjectMapper();
            response.setData(mapper.readValue(funcionEntity.getResponse(), ReserveEntity.class));
            return response;

        }catch (Exception e) {
            log.error("***** ReserveServiceImpl.saveReserve() -> ERROR: " + e.getMessage() + " *****");
        }

        return null;

    }
}
