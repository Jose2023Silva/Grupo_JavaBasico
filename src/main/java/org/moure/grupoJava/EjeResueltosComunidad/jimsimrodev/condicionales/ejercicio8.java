package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
         * Ejercicio 8
         * Pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
         */
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;
        int cifras;
        String contar;

        System.out.print("Ingrese un numero " + "-> ");
        numero = leer.nextInt();

        contar = String.valueOf(numero);

        cifras = contar.length();
        System.out.println("El numero tiene " + cifras + " cifras");
    }
}