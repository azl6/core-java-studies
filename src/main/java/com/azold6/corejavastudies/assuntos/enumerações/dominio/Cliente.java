package com.azold6.corejavastudies.assuntos.enumerações.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", codigoTipoCliente=" + tipoCliente.getCodigo() +
                '}';
    }
}
