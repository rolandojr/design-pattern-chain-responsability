package main;

import chain.responsability.Banco;

public class ChainResponsability {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.peticion(100);
    }
}
