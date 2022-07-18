package com.azold6.corejavastudies.assuntos.modelmapper.mappers;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.Aluno;
import com.azold6.corejavastudies.assuntos.modelmapper.domain.dto.AlunoResponseDTO;
import com.azold6.corejavastudies.assuntos.modelmapper.domain.dto.DisciplinaResponseDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AlunoMapper extends BaseMapper {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    DisciplinaMapper disciplinaMapper;

    /*  Conversão de DOMAIN para RESPONSEDTO.

         As primeiras 3 linhas escritas são necessárias devido a um bug no ModelMapper.
         TypeMap é uma classe que determina as duas classes envolvidas na conversão.
         typeMap.addMappings (no plural) é utilizado quando precisamos de um Converter.
         Converter é responsável por converter uma classe para outra.
            Os exemplos abaixo são:
                -Converter de data de nascimento para idade;
                -Converter de Enum para String.

         Também é possível realizar conversões mais simples, com o addMapping.

    */
    public AlunoResponseDTO domainToResponseDTO(Aluno aluno){

        TypeMap<Aluno, AlunoResponseDTO> typeMap = modelMapper.getTypeMap(Aluno.class, AlunoResponseDTO.class);

        if (typeMap == null)
            typeMap = modelMapper.createTypeMap(Aluno.class, AlunoResponseDTO.class);

        typeMap.addMappings(mapper -> mapper.using(super.idadeConverter()).map(Aluno::getDataNasc, AlunoResponseDTO::setIdade))
                .addMappings(mapper -> mapper.using(super.generoConverter()).map(Aluno::getGeneroAluno, AlunoResponseDTO::setGeneroAluno));

        AlunoResponseDTO response = modelMapper.map(aluno, AlunoResponseDTO.class);
        response.setMedia((aluno.getN1() + aluno.getN2() + aluno.getN3())/3);

        List<DisciplinaResponseDTO> disciplinasDTO = aluno.getDisciplinas()
                                                    .stream()
                                                    .map(disciplinaMapper::domainToResponseDTO)
                                                    .collect(Collectors.toList());

        response.setDisciplinas(disciplinasDTO);

        return response;
    }
}
