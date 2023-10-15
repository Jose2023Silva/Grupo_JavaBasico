package org.moure.grupoJava.alexArcentales;

import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
//        Ejercicio 7: Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas  equivalentes.
//        Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite un numero en horas: ");
        int totalHoras = teclado.nextInt();

        int horasEnSemana = 7 * 24; // 7 días en una semana, 24 horas en un día

        int semanas = totalHoras / horasEnSemana;
        int horasRestantes = totalHoras % horasEnSemana;
        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;

        System.out.println(totalHoras + " horas son equivalentes a:");
        System.out.println(semanas + " semanas, " + dias + " días, y " + horas + " horas.");

    }
}
