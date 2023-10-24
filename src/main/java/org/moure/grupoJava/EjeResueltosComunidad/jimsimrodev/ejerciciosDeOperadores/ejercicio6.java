package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.ejerciciosDeOperadores;

import java.util.Scanner;

/**
 * Ejercicio 6
 * hacer el programa que calcule el cuadrado de la suma
 *
 */
public class ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el primer numro de la suma");

        try {
            int num1 = leer.nextInt();

            System.out.println("Ingresa el segundo numro de la suma");
            int num2 = leer.nextInt();

            double cuadradoSuma = ((num1 * num1) + (2 * num1 * num2) + (num2 * num2));

            System.out.println("el cuadrado de la suma es " + cuadradoSuma);

        } catch (Exception e) {
            System.out.println("Ingresa solo datos numericos");
        }

    }
}
