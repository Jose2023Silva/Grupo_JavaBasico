package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
 * Ejercicio 1
 * Hacer un programa que lea un numero entero y muestre si el numero
 * es multiplo de 10
 */
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        try {
            System.out.print("Ingresa el numro para validar si en multiplo de 10\n-> ");
            int num = leer.nextInt();

            if (num % 10 == 0) {
                System.out.println("Es multiplo de 10");
            } else {
                System.out.println("No es multiplo de 10");
            }

        } catch (Exception e) {
            System.out.println("Ingresa solo datos numericos enteros");
        }

    }
}