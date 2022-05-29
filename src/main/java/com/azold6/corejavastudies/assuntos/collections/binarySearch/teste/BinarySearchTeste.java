package com.azold6.corejavastudies.assuntos.collections.binarySearch.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(1, 3, 8, 22, 10, 16));

        /*
        Para que o Binary Search funcione, a lista deve estar ordenada

        Retorna o índice do elemento buscado, caso ele exista
        Caso não, retorna o índice de onde o elemento deve ser inserido

        Para utilizar em objetos, deve-se usar um Comparator
         */

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 22));


    }
}
