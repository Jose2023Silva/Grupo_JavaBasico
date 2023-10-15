package org.moure.grupoJava.alexArcentales;

import java.util.Scanner;

public class CantidadDinero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
//        Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

        double guillermoDolares, luisDolares, juanDolares, total;

        System.out.print("Cuantos dolares tiene Guillermo?: ");
        guillermoDolares = teclado.nextDouble();

        luisDolares = guillermoDolares / 2;
        juanDolares = (guillermoDolares + luisDolares) / 2;

        total = guillermoDolares + luisDolares + juanDolares;

        System.out.print("Total entre los 3: " + total);

    }
}
