package com.estuturadedados;

public class Main {

    public static void main (String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue("Primeira");
        minhaFila.enqueue("Segunda");
        minhaFila.enqueue("Terceira");
        minhaFila.enqueue("Quarta");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Último");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }

}
