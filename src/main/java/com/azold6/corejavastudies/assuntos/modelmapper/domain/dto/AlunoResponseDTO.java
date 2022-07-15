package com.azold6.corejavastudies.assuntos.modelmapper.domain.dto;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.GeneroAluno;
import com.azold6.corejavastudies.assuntos.modelmapper.serializers.GeneroAlunoSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AlunoResponseDTO {

    private Integer id;
    private String nome;
    private Double media;
    private Integer idade;
    private String generoAluno;
    private List<DisciplinaResponseDTO> disciplinasDTO = new ArrayList<>();
}
