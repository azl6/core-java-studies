package com.azold6.corejavastudies.assuntos.collections.set_hashset.teste;

import com.azold6.corejavastudies.assuntos.collections.set_hashset.domain.Carro;

import java.util.HashSet;
import java.util.Set;

public class SetHashSetTeste {
    public static void main(String[] args) {
        /*
        O HashSet utiliza do equals() e do hashCode() para o seu funcionamento.
        Os objetos numa lista de HashSet devem ser únicos, já que têm um único hashCode.
        Objetos com hashCode igual utilizam do equals() para a sua distinção.

        Características do HashSet:
        -Não permite objetos duplicados
        -Muito mais performático do que o ArrayList()
        -Não garante a ordem dos objetos pertencentes

        Caso haja a necessidade de ordenar os dados, converter para ArrayList,
        ou outra implementação que permita a ordenação.
         */
        Set<Carro> carros = new HashSet<>();
        carros.add(new Carro(1, "Celta", 10000d));
        carros.add(new Carro(4, "Paraty", 4500d));
        carros.add(new Carro(2, "Camaro", 150000d));
        carros.add(new Carro(3, "Fusca", 5000d));

    }
}
