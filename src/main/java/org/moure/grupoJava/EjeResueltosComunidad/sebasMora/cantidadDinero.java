package org.moure.grupoJava.EjeResueltosComunidad.sebasMora;

import java.util.Scanner;

/*
Ejercicio 3: Guillermo tiene N dólares.
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
public class cantidadDinero {
    public static void main(String[] args){
        double luis,guillermo,juan;
        Scanner dinero = new Scanner(System.in);

        System.out.print("Digita la cantidad de dolares de Guillermo: ");
        guillermo = dinero.nextDouble();
        luis = guillermo/2;
        juan = (luis+guillermo)/2;

        double dineroTotal = guillermo + luis + juan;

        System.out.println("La cantidad de dinero que tienen entre los tres es: "+ dineroTotal);
    }
}
