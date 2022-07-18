package com.azold6.corejavastudies.assuntos.modelmapper.mappers;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.Disciplina;
import com.azold6.corejavastudies.assuntos.modelmapper.domain.dto.DisciplinaResponseDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisciplinaMapper {

    @Autowired
    ModelMapper modelMapper;

    public DisciplinaResponseDTO domainToResponseDTO(Disciplina disciplina){
        TypeMap<Disciplina, DisciplinaResponseDTO> typeMap = modelMapper.getTypeMap(Disciplina.class, DisciplinaResponseDTO.class);

        if(typeMap == null)
            typeMap = modelMapper.createTypeMap(Disciplina.class, DisciplinaResponseDTO.class);

        typeMap.addMapping(Disciplina::getId, DisciplinaResponseDTO::setId);
        typeMap.addMapping(Disciplina::getSigla, DisciplinaResponseDTO::setSigla);

        return modelMapper.map(disciplina, DisciplinaResponseDTO.class);
    }
}
