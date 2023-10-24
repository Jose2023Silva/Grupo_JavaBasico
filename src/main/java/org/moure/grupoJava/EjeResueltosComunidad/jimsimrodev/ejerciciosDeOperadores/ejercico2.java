package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.ejerciciosDeOperadores;

import java.util.Scanner;

/**
 * Ejercicio 2
 * Hacer un programa que calcule e imprima el salario semanal de un empleado a
 * partir
 * de sus horas semanales trabajadas y salario por hora
 */
public class ejercico2 {
        public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);

                double horasSemanas = 0;
                double salarioSemanal = 0;
                double pagoTotal = 0;

                int hora = 4160;
                int semanasMes = 4;

                for (int i = 1; i <= semanasMes; i++) {
                        System.out.println("Ingrese cuantas horas laboro la semana " + i);
                        horasSemanas = leer.nextDouble();
                        salarioSemanal = (horasSemanas * hora);

                        System.out.println("El salario de la " + (i) + " semna es = " + salarioSemanal);

                        pagoTotal += salarioSemanal;

                        System.out.println("\n=============================================");
                        System.out.println("Total de salario acumulado es de = " + "|" + pagoTotal + "|");
                        System.out.println("=============================================\n");
                }
        }

}
