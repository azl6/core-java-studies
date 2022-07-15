package com.azold6.corejavastudies.assuntos.modelmapper.controller;

import com.azold6.corejavastudies.assuntos.modelmapper.domain.Aluno;
import com.azold6.corejavastudies.assuntos.modelmapper.dto.AlunoResponseDTO;
import com.azold6.corejavastudies.assuntos.modelmapper.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
    ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> findAll(){
        return ResponseEntity.ok(alunoRepository.findAll()
                .stream()
                .map(aluno -> modelMapper.map(aluno, AlunoResponseDTO.class))
                .collect(Collectors.toList()));
    }
}
