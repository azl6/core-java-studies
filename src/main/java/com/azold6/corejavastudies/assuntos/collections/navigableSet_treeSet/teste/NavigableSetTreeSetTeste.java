package com.azold6.corejavastudies.assuntos.collections.navigableSet_treeSet.teste;

import com.azold6.corejavastudies.domain.Carro;
import com.azold6.corejavastudies.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartphonePriceComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone s1, Smartphone s2) {
        return s1.getPreco().compareTo(s2.getPreco());
    }
}

public class NavigableSetTreeSetTeste {
    public static void main(String[] args) {

        /*
        O NavigableSet é um Set, ou seja, não permite elementos duplicados

        Além disso, a implementação TreeSet é ordenada, por isso, obriga que
        a classe em questão tenha o Comparable implementado, ou que um Comparator
        seja passado na instanciação do TreeSet.

        Complexidade O(lg n) para as operações
         */

        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphonePriceComparator());
        smartphones.add(new Smartphone("iPhone X", 10000d));
        smartphones.add(new Smartphone("iPhone XR", 12000d));
        smartphones.add(new Smartphone("Samsumg Galaxy S4", 500d));
        smartphones.add(new Smartphone("Samsumg Galaxy S20", 7000d));

        for (Smartphone smartphone: smartphones)
            System.out.println(smartphone);
    }
}
