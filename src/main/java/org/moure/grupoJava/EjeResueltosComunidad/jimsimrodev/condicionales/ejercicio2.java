package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
 * Ejercicio 2
 * Pedir dos numeros y decir cual es el mayor o si son iguales
 */
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Ingresa el primer numero");
            int num1 = leer.nextInt();

            System.out.println("Ingresa el segundo numero");
            int num2 = leer.nextInt();

            if (num1 == num2) {
                System.out.println(
                        "Los numeros son iguales el primer numero es " + num1 + " el segundo numero es " + num2);
            } else if (num1 < num2) {
                System.out.println("el segundo numero es mayor que el primero el primer numero es " + num1
                        + " el segundo numero es " + num2);
            } else {
                System.out.println("el primer numero es mayor que el segundo numero el primer numero es " + num1
                        + " el segundo numero es " + num2);
            }

        } catch (Exception e) {
            System.out.println("Ingresa solo datos numericos enteros");
        }

    }
}
