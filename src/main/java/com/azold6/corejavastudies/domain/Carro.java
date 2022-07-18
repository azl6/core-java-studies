package com.azold6.corejavastudies.domain;

import com.azold6.corejavastudies.domain.serializers.PrecoSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carro implements Comparable<Carro> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @JsonSerialize(using = PrecoSerializer.class)
    private Double preco;

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return id.equals(carro.id) && nome.equals(carro.nome) && preco.equals(carro.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Carro outroCarro) {
        //retorna negativo se this < outroCarro
        //retorna 0 se this == outroCarro
        //retorna positivo se this > outroCarro
        return this.id.compareTo(outroCarro.getId());

        /*forma alternativa:

        if(this.id < outroCarro.getId())
            return -1;
        else if (this.id.equals(outroCarro.getId()))
            return 0;
        else
            return 1;

       */

    }
}