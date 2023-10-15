package org.moure.grupoJava.sebasMora;

import java.util.Scanner;

public class ejercicio5 {
    /*
    * Ejercicio 5: La calificación final de un estudiante de Informática se calcula con
    * base a las calificaciones de cuatro aspectos de su rendimiento académico: participación,
    * primer examen parcial, segundo examen parcial y examen final. Sabiendo que las calificaciones
    * anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%,
    * Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
    * */
    public static void main(String[] args){
        Scanner entradas = new Scanner(System.in);
        double participacion,primerExamen,segundoExamen,examenFinal;

        System.out.print("Digite la participación: ");
        participacion = entradas.nextDouble();
        System.out.print("Digite el primer examen: ");
        primerExamen = entradas.nextDouble();
        System.out.print("Digite el segundo examen: ");
        segundoExamen = entradas.nextDouble();
        System.out.print("Digite el examen final: ");
        examenFinal = entradas.nextDouble();

        double participacionPorcentaje = participacion * 0.1;
        double primerExamenPorcentaje = primerExamen * 0.25;
        double segundoExamenPorcentaje = segundoExamen * 0.25;
        double examenFinalPorcentaje = examenFinal * 0.4;

        double rendimiento = participacionPorcentaje + primerExamenPorcentaje + segundoExamenPorcentaje + examenFinalPorcentaje;

        System.out.println("El rendimiento academico es de: "+rendimiento);

    }
}
