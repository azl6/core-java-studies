package com.azold6.corejavastudies.assuntos.interfaces.domain;

public interface Loader {
    public static final String NOT_CHANGED = "I am public static final!";

    //by default, interface methods are public abstract
    public abstract void load();

    //default methods are implementable on interface-level
    default void imImplemented(){
        System.out.println("I'm implemented!");
    }

}
