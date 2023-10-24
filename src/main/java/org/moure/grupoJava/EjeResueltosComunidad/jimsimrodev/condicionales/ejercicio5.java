package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
 * Ejercicio 5
 * Un obrero necesita calcular su salario semanal, el cual
 * se obtiene de la siguiete manera
 * Si trabaja 40 horas o menos, se le paga $16 la hora.
 * Si trabaja mas de 40 horas se le paga $16 por cada una de las
 *  primeras horas y $20 por cada hora extra.
 */
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        double horasSemanales = 40 * 16;
        double totalHoras = 0;
        double extras = 0;
        double pagoTotal = 0;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese cuantas horas extras laboro esta semana ->");
        extras = leer.nextDouble();
        totalHoras = (horasSemanales + extras);

        if (totalHoras > 40) {
            pagoTotal = (horasSemanales + (extras * 20));
            System.out.println("El total a pagar de esta semana es de " + pagoTotal);
        } else {
            System.out.println("El total a pagar de esta semana es de " + horasSemanales);
        }
    }
}
