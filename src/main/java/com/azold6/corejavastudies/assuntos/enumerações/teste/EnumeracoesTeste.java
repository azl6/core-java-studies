package com.azold6.corejavastudies.assuntos.enumerações.teste;

import com.azold6.corejavastudies.assuntos.enumerações.domain.Cliente;
import com.azold6.corejavastudies.assuntos.enumerações.domain.TipoCliente;
import com.azold6.corejavastudies.assuntos.enumerações.domain.TipoPagamento;

public class EnumeracoesTeste {

    public static void main(String[] args) {
        //teste TipoCliente
        Cliente cliente1 = new Cliente("Alex", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Rodrigo", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        //fim teste tipoCliente

        System.out.println("***********************************************************");

        //teste TipoPagamento
        cliente1.setTipoPagamento(TipoPagamento.CREDITO);
        System.out.println("Desconto cliente 1: " + cliente1.getTipoPagamento().calculaDesconto(1000d));

        cliente2.setTipoPagamento(TipoPagamento.DEBITO);
        System.out.println("Desconto cliente 2: " + cliente2.getTipoPagamento().calculaDesconto(1000d));
        //fim teste tipoPagamento
    }
}
