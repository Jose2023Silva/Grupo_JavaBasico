package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.ejerciciosDeOperadores;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double dolaresGuillermo = 0;
        double dolaresLuis = 0;
        double dolaresJuan = 0;
        double total = 0;

        System.out.print("Ingrese la cantidad de dinero que tiene Guillermo\n->:");

        try {
            dolaresGuillermo = leer.nextDouble();

            total += dolaresGuillermo;

            dolaresLuis = (dolaresGuillermo * 0.5);
            total += dolaresLuis;

            dolaresJuan = (total * 0.5);
            total += dolaresJuan;

            System.out.println("Guillermo tiene $" + dolaresGuillermo + " Dolares");
            System.out.println("Luis tiene $" + dolaresLuis + " Dolares");
            System.out.println("Juan tiene $" + dolaresJuan + " Dolares");
            System.out.println("La cantidad de dinero que tiene entre los tres es de $" + total + " Dolares");

        } catch (Exception e) {
            System.out.println("Debes Ingresar un dato numerico");
        }
    }
}
