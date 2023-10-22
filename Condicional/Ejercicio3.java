package Condicional;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  System.out.println ("Digite un caracter: ");
	  
	  char letra = entrada.next().charAt(0);
	  int valor = (int)letra;
	  
	  if (valor >= 65 && valor <= 90) {System.out.println("El caracter " + letra + " es mayuscula.");}
	  else {System.out.println("El caracter " + letra + " No es mayuscula.");}
	}
}
