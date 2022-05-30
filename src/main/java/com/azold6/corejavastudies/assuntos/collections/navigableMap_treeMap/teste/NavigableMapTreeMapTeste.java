package com.azold6.corejavastudies.assuntos.collections.navigableMap_treeMap.teste;

import com.azold6.corejavastudies.assuntos.collections.navigableMap_treeMap.domain.Pessoa;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTreeMapTeste {
    public static void main(String[] args) {

        /*
        O NavigableMap segue o mesmo princípio que o NavigableSet:

        -A chave deve implementar Comparable, ou um Comparator deve ser passado na instanciação.
        -Não permite elementos duplicados, e é ordenado.

        O código abaixo, por exemplo, lançará ClassCastException,
        Já que a chave "Pessoa" não implementa Comparable, e nem foi passado um Comparator.
         */

        NavigableMap<Pessoa, Integer> pessoaMap = new TreeMap<>();
        pessoaMap.put(new Pessoa(21, "Alex"), 1);
        pessoaMap.put(new Pessoa(20, "Bruna"), 2);

        for(Map.Entry<Pessoa, Integer> entry: pessoaMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
