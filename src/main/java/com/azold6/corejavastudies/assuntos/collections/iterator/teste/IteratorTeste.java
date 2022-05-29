package com.azold6.corejavastudies.assuntos.collections.iterator.teste;

import com.azold6.corejavastudies.assuntos.collections.iterator.domain.Carro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro(1, "Celta", 10000d));
        carros.add(new Carro(4, "Paraty", 4500d));
        carros.add(new Carro(2, "Camaro", 150000d));
        carros.add(new Carro(3, "Fusca", 5000d));

//        Iterator<Carro> carroIterator = carros.iterator();
//
//        while (carroIterator.hasNext()) {
//            Carro carroVerif = carroIterator.next();
//
//            if (carroVerif.getPreco() <= 5000d)
//                carroIterator.remove();
//        }

        //Todo o código acima pode ser substituído pela lambda abaixo
        carros.removeIf(manga -> manga.getPreco() <= 5000d);

        System.out.println(carros);
    }
}
