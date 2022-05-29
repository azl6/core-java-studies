package com.azold6.corejavastudies.assuntos.collections.comparable.teste;

import com.azold6.corejavastudies.assuntos.collections.comparable.domain.Carro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTeste {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro(3, "Corolla", 50000.0));
        carros.add(new Carro(1, "Gol bolinha", 15000.0));
        carros.add(new Carro(2, "Celta", 10000.0));

        Collections.sort(carros);

        for(Carro carro: carros)
            System.out.println(carro);

    }
}
