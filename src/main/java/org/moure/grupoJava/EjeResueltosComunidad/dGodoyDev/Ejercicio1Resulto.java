/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.moure.grupoJava.EjeResueltosComunidad.dGodoyDev;

import java.util.Scanner;

public class Ejercicio1Resulto {
    public static void main(String[] args){
      
        /**
         * Ejercicio 1
         * Hacer un programa que lea un numero entero y muestre si el numero
         * es multiplo de 10
         */

    //Aqui leemos el numero ingresado por el usuario a travez del comando Scanner 
    //que nos permite leer lo que es ingresado por el teclado 
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingresa un numero para verificar si es multiplo de 10");
    
    int numero = scanner.nextInt();
    
    if (numero % 10 == 0) {
    System.out.println("El " +numero+ " si es divisible entre 10 ");
    
    }else {
    System.out.println("El " +numero+ " no es divisible entre 10 ");
    
    }
    scanner.close();
    
       
}
}
