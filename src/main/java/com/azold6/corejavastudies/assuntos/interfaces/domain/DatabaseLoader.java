package com.azold6.corejavastudies.assuntos.interfaces.domain;

public class DatabaseLoader implements Loader {
    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }
}
