package com.azold6.corejavastudies.assuntos.enumerações.dominio;

public enum TipoCliente {

    //dentro dos (), entra-se os atributos da classe, neste
    //caso, codigo e nome, e deve-se inicializá-los no construtor
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    //atributos
    private Integer codigo;
    private String nome;

    //atributos inicializados
    TipoCliente(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
