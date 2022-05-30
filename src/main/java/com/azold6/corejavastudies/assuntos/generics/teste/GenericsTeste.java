package com.azold6.corejavastudies.assuntos.generics.teste;

import java.util.List;

abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void agir();

    public String getNome() {
        return nome;
    }
}

class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void agir() {
        System.out.println("Resposta: Auau!");
    }
}

class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void agir() {
        System.out.println("Resposta: Miau!");
    }
}

public class GenericsTeste {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro("Caramelinho"), new Cachorro("Spike"));
        List<Gato> gatos = List.of(new Gato("Mel"));

        darComida(cachorros);
        darComida(gatos);

    }

    static void darComida(List<? extends Animal> animais){
        for (Animal animal: animais){
            System.out.println(String.format("Dando comida ao %s...", animal.getNome()));
            animal.agir();
        }
    }
}
