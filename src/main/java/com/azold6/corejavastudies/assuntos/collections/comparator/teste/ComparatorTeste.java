package com.azold6.corejavastudies.assuntos.collections.comparator.teste;

import com.azold6.corejavastudies.assuntos.collections.comparator.domain.Carro;
import com.azold6.corejavastudies.assuntos.collections.comparator.domain.CarroByIdComparator;
import com.azold6.corejavastudies.assuntos.collections.comparator.domain.CarroByNomeComparator;
import com.azold6.corejavastudies.assuntos.collections.comparator.domain.CarroByPrecoComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTeste {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro(3, "Corolla", 50000.0));
        carros.add(new Carro(1, "Gol bolinha", 15000.0));
        carros.add(new Carro(2, "Celta", 10000.0));

        System.out.println("Ordenando por id:");
        Collections.sort(carros, new CarroByIdComparator());

        for(Carro carro: carros)
            System.out.println(carro);

        System.out.println("***************");

        System.out.println("Ordenando por nome:");
        Collections.sort(carros, new CarroByNomeComparator());

        for(Carro carro: carros)
            System.out.println(carro);

        System.out.println("***************");

        System.out.println("Ordenando por preço:");
        Collections.sort(carros, new CarroByPrecoComparator());

        for(Carro carro: carros)
            System.out.println(carro);}
}


