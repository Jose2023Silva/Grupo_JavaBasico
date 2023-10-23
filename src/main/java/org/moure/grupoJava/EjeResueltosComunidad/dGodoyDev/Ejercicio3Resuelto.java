package org.moure.grupoJava.EjeResueltosComunidad.dGodoyDev;

import java.util.Scanner;

public class Ejercicio3Resuelto {
        /**
         *  Ejercicio 3
         *  Guillermo tiene N dolars, luis tiene la mitad de lo que posee Guillermo.
         *  Juan tiene la mitad de lo que poseen luis y Guillermo juntos.
         *  Hacer el programa que calcule e imprima la cantidad de dinero que tienen entre los
         *  tres.
         *
         */
         
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo:");
        double guillermoDinero = input.nextDouble();

        double luisDinero = guillermoDinero / 2;
        double juanDinero = (guillermoDinero + luisDinero) / 2;

        double totalDinero = guillermoDinero + luisDinero + juanDinero;

        System.out.println("Guillermo tiene $" + guillermoDinero);
        System.out.println("Luis tiene $" + luisDinero);
        System.out.println("Juan tiene $" + juanDinero);
        System.out.println("La cantidad total de dinero entre los tres es $" + totalDinero);

        input.close();
    }
}
   
       

