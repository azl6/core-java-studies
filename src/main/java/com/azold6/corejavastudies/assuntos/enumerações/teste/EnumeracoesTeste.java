package com.azold6.corejavastudies.assuntos.enumerações.teste;

import com.azold6.corejavastudies.assuntos.enumerações.dominio.Cliente;
import com.azold6.corejavastudies.assuntos.enumerações.dominio.TipoCliente;

public class EnumeracoesTeste {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alex", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Rodrigo", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
