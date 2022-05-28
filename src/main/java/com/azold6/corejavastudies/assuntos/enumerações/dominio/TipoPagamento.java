package com.azold6.corejavastudies.assuntos.enumerações.dominio;

public enum TipoPagamento {

    CREDITO{
        @Override
        public Double calculaDesconto(Double valor) {
            return valor * 0.05;
        }
    },
    DEBITO{
        @Override
        public Double calculaDesconto(Double valor) {
            return valor * 0.10;
        }
    };

    public abstract Double calculaDesconto(Double valor);
}
