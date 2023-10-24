package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.ejerciciosDeOperadores;

import java.util.Scanner;

/**
 * Ejercicio 4
 * Una empresa de venta de carros usados, paga a su personal de ventas
 * un salario de $1000 mensuales, mas una comision de $150 por cada
 * carro vendido, mas el %5 del valor de la venta por carro.
 * Cada mes el capturista de la empresa ingresa en la computadora los datos
 * pertinentes.
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor
 * dado.
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidadVendida = 0;
        int salarioBase = 1000;
        int comision = 150;
        double porcentajeVenta = 0.05;
        double ventaUni = 0;
        double ventaTotal = 0;

        System.out.print("Ingrese la cantidad de carros vendidos\n ->: ");
        cantidadVendida = leer.nextInt();

        int comisionTotal = (cantidadVendida * comision);
        System.out.println("" + comisionTotal);

        System.out.print("Ingresa el valor de venta por carro \n->: ");
        ventaUni = leer.nextDouble();

        ventaTotal = (cantidadVendida * ventaUni);
        double porcentajeTotal = (ventaTotal * porcentajeVenta);
        System.out.println("" + porcentajeTotal);

        double salarioMensual = (comisionTotal + porcentajeTotal + salarioBase);

        System.out.println("Salario Mensual Del Vendedor es " + salarioMensual);

    }
}
