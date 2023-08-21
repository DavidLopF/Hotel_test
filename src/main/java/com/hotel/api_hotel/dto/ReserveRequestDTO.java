package com.hotel.api_hotel.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.io.Serializable;

@Data
public class ReserveRequestDTO implements Serializable {

    @NotNull
    @Length(min = 1, max = 10)
    private String dniClient;

    @NotEmpty
    @NotNull
    @Length(min = 10, max = 10)
    private String dateIn;

    @NotEmpty
    @NotNull
    @Length(min = 10, max = 10)
    private String dateOut;

    @NotNull
    @Positive(message = "El idRoom debe ser mayor que cero")
    private int idRoom;

}
