package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.ejerciciosDeOperadores;

/**
 * Ejercicio 5
 * La calificacion final de un estudiante de informatica se calcula con
 * base a las calidicaciones de cuatro aspectos de su rendimiento academico:
 * Participacion
 * Primer Examen parcial
 * Segundo Examen parcial
 * Examen final
 * Sabiendo que las calidicaciones anteriores entran a la calidicacion final con
 * ponderadores del 10%. 25%, 25% y 40%.
 * Hacer un programa que calcule e imprima la calidicacion final obtenida por un estudiante.
 *
 */
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la nota de la participacion");
        double participacion = leer.nextDouble();
        double nota1 = (participacion * 0.1);

        System.out.println("Ingrese la nota del primer Parcial");
        double primerParcial = leer.nextDouble();
        double nota2 = (primerParcial * 0.25);

        System.out.println("Ingrese la nota del sugundo parcial");
        double segundoParcial = leer.nextDouble();
        double nota3 = (segundoParcial * 0.25);

        System.out.println("Ingrese la nota del Examen Final ");
        double examenFinal = leer.nextDouble();
        double nota4 = (examenFinal * 0.4);

        double notaFinal = nota1 + nota2 + nota3 + nota4;

        System.out.println("La calificacion definitiva del estudiate es " + notaFinal);

    }
}
