package com.azold6.corejavastudies.domain.controller;

import com.azold6.corejavastudies.domain.Carro;
import com.azold6.corejavastudies.domain.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    CarroRepository carroRepository;

    @GetMapping
    public ResponseEntity<List<Carro>> findAll(){
        return ResponseEntity.ok().body(carroRepository.findAll());
    }
}
