package com.azold6.corejavastudies.assuntos.modelmapper.mappers;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.Aluno;
import com.azold6.corejavastudies.assuntos.modelmapper.domain.dto.AlunoResponseDTO;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Component
public class AlunoMapper extends BaseMapper {

    @Autowired
    ModelMapper modelMapper;

    public AlunoResponseDTO domainToResponseDTO(Aluno aluno){

        TypeMap<Aluno, AlunoResponseDTO> typeMap = modelMapper.createTypeMap(Aluno.class, AlunoResponseDTO.class);

        typeMap.addMappings(mapper -> mapper.using(super.idadeConverter()).map(Aluno::getDataNasc, AlunoResponseDTO::setIdade));

        AlunoResponseDTO response = modelMapper.map(aluno, AlunoResponseDTO.class);
        response.setMedia((aluno.getN1() + aluno.getN2() + aluno.getN3())/3);

        return response;
    }
}
