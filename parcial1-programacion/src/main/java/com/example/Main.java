package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Libro con constructor
        Libro libro1 = new Libro("El Quijote", "Cervantes", 5, 1);

        // Libro por consola
        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo del libro:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor:");
        libro2.setAutor(sc.nextLine());

        System.out.println("Numero de ejemplares:");
        libro2.setNumEjemplares(sc.nextInt());

        libro2.setNumPrestados(0);

        // LibroTextoUNIAC
        LibroTextoUNIAC libroUniac =
                new LibroTextoUNIAC("Calculo", "Stewart", 10, 2, "Matematicas", "Ingenieria");

        // Novela
        Novela novela =
                new Novela("Dracula", "Bram Stoker", 4, 1, "Terror");

        // Probar métodos
        libro1.prestamo();
        libro1.devolucion();

        // Mostrar resultados
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroUniac);
        System.out.println(novela);

    }
}