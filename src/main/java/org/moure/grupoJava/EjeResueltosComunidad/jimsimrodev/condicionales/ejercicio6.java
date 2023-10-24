package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
 * Ejercicio 6
 * Hacer un programa que tome dos numeros y diga si ambos son pares o impares
 */
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero -> ");
        int numero1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero -> ");
        int numero2 = leer.nextInt();

        if (numero1 % 2 == 0) {
            System.out.println("el numero " + numero1 + " es par");
        } else {
            System.out.println("el numero " + numero1 + " es impar");
        }

        if (numero2 % 2 == 0) {
            System.out.println("el numero " + numero2 + " es par");
        } else {
            System.out.println("el numero " + numero2 + " es impar");
        }
    }
}
