package com.azold6.corejavastudies.assuntos.collections.comparator.domain;

import java.util.Comparator;

public class CarroByNomeComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro carro1, Carro carro2) {
        return carro1.getNome().compareTo(carro2.getNome());
    }
}