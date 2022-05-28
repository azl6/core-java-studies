package com.azold6.corejavastudies.assuntos.exceptions.teste;

public class ExceptionsTeste {
    public static void main(String[] args) {
        /*
        Throwable é o pai de toda exceção, que tem como filhos diretos: Errors e Exceptions
        Errors são problemas que não podem ser resolvidos em tempo de execução, como um stack-overflow,
        falta de memória, servidor indisponível, etc

        Exceptions possuem as RuntimeExceptions e Exceptions como filhos.
        As RuntimeException são ocasionadas pelo programador, como IndexOutOfBounds, ou NullPointer.

        RuntimeExceptions são unckeched, ou seja, NÃO PRECISAM OBRIGATÓRIAMENTE SEREM TRATADAS.

        As Exceptions, por sua vez, são checked, e PRECISAM SER TRATADAS. Tem como exemplo a IOException.
        */

        try{
            System.out.println("Primeiro print!");
            throw new RuntimeException();
            //demais prints ficariam unreacheable
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally{
            //executado antes da exceção
            System.out.println("Sou executado independente do resultado!");
        }
    }
}