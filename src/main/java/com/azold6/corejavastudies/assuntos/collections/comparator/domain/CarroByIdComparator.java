package com.azold6.corejavastudies.assuntos.collections.comparator.domain;

import java.util.Comparator;

public class CarroByIdComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro carro1, Carro carro2) {
        return carro1.getId().compareTo(carro2.getId());
    }
}