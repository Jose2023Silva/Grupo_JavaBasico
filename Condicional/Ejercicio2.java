package Condicional;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduccir el 1 número entero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Introduccir el 2 número entero: ");
		int numero2 = entrada.nextInt();
		
		if (numero1 > numero2) {System.out.println("El numero " + numero1 + " es mayor que " + numero2);}
		  else if (numero1 < numero2) {System.out.println("El numero " + numero1 + " es menor que " + numero2);}
			   else {System.out.println("El numero " + numero1 + " es igual que " + numero2);  }
	}
}
