package Condicional;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduccir el importe de la compra: ");
		float importe = entrada.nextFloat();
		
		if (importe > 300) {System.out.println("Se aplica un 20% de descuento, el total es: " + importe*0.80);}
		else {System.out.println("No aplica descuento, el total apagares: " + importe);}
	}
}
