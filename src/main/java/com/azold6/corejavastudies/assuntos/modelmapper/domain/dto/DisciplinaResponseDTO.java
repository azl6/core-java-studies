package com.azold6.corejavastudies.assuntos.modelmapper.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DisciplinaResponseDTO implements Serializable {

    private Integer id;
    private String sigla;
}
