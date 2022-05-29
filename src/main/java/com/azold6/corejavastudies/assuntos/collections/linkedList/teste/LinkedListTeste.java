package com.azold6.corejavastudies.assuntos.collections.linkedList.teste;

import com.azold6.corejavastudies.domain.Carro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTeste {
    public static void main(String[] args) {

        /*
        A LinkedList possui apontadores para o objeto posterior e anterior,
        agilizando algumas operações (como a remoção de dados, e a manipulação no geral),
        quando comparada com a ArrayList.
         */
        List<Carro> carros = new LinkedList<>();
        carros.add(new Carro(1, "Celta", 10000d));
        carros.add(new Carro(4, "Paraty", 4500d));
        carros.add(new Carro(2, "Camaro", 150000d));
        carros.add(new Carro(3, "Fusca", 5000d));


    }
}
