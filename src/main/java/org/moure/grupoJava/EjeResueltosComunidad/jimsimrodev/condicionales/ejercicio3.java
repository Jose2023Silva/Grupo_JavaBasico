package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
 * Ejercicio 3
 * Hacer un programa que lea un carácter por el teclado y compruebe
 * si es una letra Mayúscula.
 */
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el caracter");
        String letra = leer.nextLine();

        if (!letra.isEmpty() && Character.isLetter(letra.charAt(0))) {

            if (Character.isUpperCase(letra.charAt(0))) {
                System.out.println("Es una letra mayuscula");
            } else {
                System.out.println("Es una letra minuscula");
            }
        } else {
            System.out.println("Ingresa solo letras");
        }
    }
}