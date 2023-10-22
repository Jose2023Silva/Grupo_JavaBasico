package Condicional;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	  System.out.println ("Introduccir un numero entero: ");
	  int numero = entrada.nextInt();
	  
	  if (numero % 10 == 0) {System.out.println("El numero " + numero + " es multiplo de 10.");}
	  else {System.out.println("El numero " + numero + " no es multiplo de 10.");}

	}

}
