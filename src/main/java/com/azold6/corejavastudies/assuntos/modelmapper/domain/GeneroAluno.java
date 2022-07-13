package com.azold6.corejavastudies.assuntos.modelmapper.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GeneroAluno {

    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino");

    private Integer codigo;
    private String nome;

}
