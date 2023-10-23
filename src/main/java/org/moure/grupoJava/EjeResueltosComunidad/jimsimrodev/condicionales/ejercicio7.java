package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
 * Ejercicio 7
 * Pedir tres numeros y mostrarlos ordenados de mayor a menor
 */
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int intermedio = 0;

        System.out.println("Ingrea el primer numero");
        int numero1 = leer.nextInt();

        System.out.println("Ingrea el segundo numero");
        int numero2 = leer.nextInt();

        System.out.println("Ingrea el tercer numero");
        int numero3 = leer.nextInt();

        int menor = numero1;

        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 < menor) {
            menor = numero3;
        }

        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        intermedio = numero1 + numero2 + numero3 - menor - mayor;

        System.out.println("Numeros ordenados de menor a mayor " + menor + "," + intermedio + "," + mayor);

    }
}
