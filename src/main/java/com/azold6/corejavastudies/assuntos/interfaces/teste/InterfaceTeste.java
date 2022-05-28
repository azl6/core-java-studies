package com.azold6.corejavastudies.assuntos.interfaces.teste;

import com.azold6.corejavastudies.assuntos.interfaces.domain.DatabaseLoader;
import com.azold6.corejavastudies.assuntos.interfaces.domain.FileLoader;

public class InterfaceTeste {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.load();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();

        databaseLoader.imImplemented();
        fileLoader.imImplemented();
    }

}
