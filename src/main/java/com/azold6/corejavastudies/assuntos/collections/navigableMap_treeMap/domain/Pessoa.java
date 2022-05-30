package com.azold6.corejavastudies.assuntos.collections.navigableMap_treeMap.domain;

import java.util.Objects;

public class Pessoa{

    private Integer age;
    private String name;

    public Pessoa(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return age.equals(pessoa.age) && name.equals(pessoa.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(Pessoa p) {
//        return this.getAge().compareTo(p.getAge());
//    }
}
