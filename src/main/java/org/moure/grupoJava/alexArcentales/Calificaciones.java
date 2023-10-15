package org.moure.grupoJava.alexArcentales;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones.

        System.out.print("Digite primera calificacion: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite segunda calificacion: ");
        int numero2 = teclado.nextInt();
        System.out.print("Digite tercera calificacion: ");
        int numero3 = teclado.nextInt();

        int sumaTotal = numero1 + numero2 + numero3;

        System.out.print("La suma total de las calificaciones son: " + sumaTotal);

//        Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
//        Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

//        double guillermoDolares, luisDolares, juanDolares, total;
//
//        System.out.print("Cuantos dolares tiene Guillermo?: ");
//        guillermoDolares = teclado.nextDouble();
//
//        luisDolares = guillermoDolares / 2;
//        juanDolares = (guillermoDolares + luisDolares) / 2;
//
//        total = guillermoDolares + luisDolares + juanDolares;
//
//        System.out.print("Total entre los 3: " + total);

    }
}
