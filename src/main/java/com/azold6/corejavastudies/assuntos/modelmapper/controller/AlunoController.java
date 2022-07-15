package com.azold6.corejavastudies.assuntos.modelmapper.controller;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.dto.AlunoResponseDTO;
import com.azold6.corejavastudies.assuntos.modelmapper.mappers.AlunoMapper;
import com.azold6.corejavastudies.assuntos.modelmapper.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alunos")
@AllArgsConstructor
public class AlunoController {

    AlunoRepository alunoRepository;
    AlunoMapper alunoMapper;

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> findAll(){
        return ResponseEntity.ok(alunoRepository.findAll()
                .stream()
                .map(aluno -> alunoMapper.domainToResponseDTO(aluno))
                .collect(Collectors.toList()));
    }
}
