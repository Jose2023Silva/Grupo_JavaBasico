package main.java.org.moure.grupoJava.EjeResueltosComunidad.jimsimrodev.condicionales;

/**
 * Ejercicio 4
 * En una megaplaza se hace un 20% de descuento a los clientes cuya
 * compra supere los $300.
 * Cual es la compra que pagara una persona por su compra.
 */
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        double precio = 0;
        double descuento = 0;
        double total = 0;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el valor de la compra -> ");
        precio = leer.nextInt();

        if (precio > 300) {
            descuento = (precio * 0.2);
            total = (precio - descuento);
            System.out.println("El valor a pagar es de " + total);
        } else {
            System.out.println("El valor a pagar es de " + precio);
        }
    }
}
