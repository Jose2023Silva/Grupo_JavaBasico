package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.ejerciciosDeOperadores;

/*
 * Ejercicio 1
 * Hacer un programa que calcule e imprima la suma de tres calificaciones
 * usando la clase Scanner para la entrada de datos.
*/
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digita la calificacion -> " + i);
            int cali = leer.nextInt();

            while (cali < 1 || cali > 5) {
                System.out.println("| Ingresa una calificacion valida entre 1-5! |");
                System.out.println("Digita la calificacion -> " + i);
                cali = leer.nextInt();
            }
            suma += cali;
        }
        System.out.println("La suma de las 3 calificaciones es = " + suma);
    }
}