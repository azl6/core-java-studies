package com.azold6.corejavastudies.assuntos.collections.comparator.domain;


import com.azold6.corejavastudies.domain.Carro;

import java.util.Comparator;

public class CarroByPrecoComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro carro1, Carro carro2) {
        return carro1.getPreco().compareTo(carro2.getPreco());
    }
}