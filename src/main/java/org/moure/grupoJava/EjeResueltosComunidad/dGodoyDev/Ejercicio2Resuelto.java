/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.moure.grupoJava.EjeResueltosComunidad.dGodoyDev;

import java.util.Scanner;

/**
 *
 * @author durvin
 */
public class Ejercicio2Resuelto {
            /**
         * Ejercicio 2
         * Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
         * de sus horas semanales trabajadas y salario por hora
         */
    public static void main(String[] args) {
        
        double salarioTrabajadasPorSemana;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el salario por hora del trabajador");
        double salarioPorHora =  sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Ingresa el nombre del Trabajador");
        String nombreTrabajador = sc.nextLine();
        
        System.out.println("Ingresa horas trabajadas Semanalmente");
        int horasTrabajadas = sc.nextInt();
        
        sc.close();
        
        salarioTrabajadasPorSemana =(salarioPorHora*horasTrabajadas);
        
        System.out.println("Las horas trabajadas por, "+nombreTrabajador+" son $"+salarioTrabajadasPorSemana);

    }
    
    

    
    
    
}
