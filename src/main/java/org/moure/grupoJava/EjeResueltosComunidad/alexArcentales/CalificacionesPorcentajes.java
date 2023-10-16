package org.moure.grupoJava.EjeResueltosComunidad.alexArcentales;

import java.util.Scanner;

public class CalificacionesPorcentajes {
    public static void main(String[] args) {
//        Ejercicio 5: La calificación final de un estudiante de Informática se calcula con base a las calificaciones
//        de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.
//        Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa
//        que calcule e imprima la calificación final obtenida por un estudiante.

        float participacion, primerExamen, segundoExamen, finalExamen, promedioFinal;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite la calificacion por PARTICIPACION (10%): ");
        participacion = teclado.nextFloat();

        System.out.print("Digite la calificacion de EXAMEN 1ER PARCIAL (25%): ");
        primerExamen = teclado.nextFloat();

        System.out.print("Digite la calificacion de EXAMEN 2DO PARCIAL (25%): ");
        segundoExamen = teclado.nextFloat();

        System.out.print("Digite la calificacion de EXAMEN FINAL (40%): ");
        finalExamen = teclado.nextFloat();

        participacion = (float) (participacion * 0.1);
        primerExamen = (float) (primerExamen * 0.25);
        segundoExamen = (float) (segundoExamen * 0.25);
        finalExamen = (float) (finalExamen * 0.4);

        promedioFinal = participacion + primerExamen + segundoExamen + finalExamen;

        System.out.print("Su promedio final es de: " + promedioFinal);
    }
}
