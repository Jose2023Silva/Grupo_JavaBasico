package Condicional;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	  System.out.println("Introduccir horas trabajadas en la semana (numero entero): ");
	  int horas = entrada.nextInt();
	  
	  if (horas <= 40) {System.out.println("El importe a cobrar es: " + horas*16 + "$");}
	   else {System.out.println("El importe a cobrar es (40 h X 16$, el resto a 20$):  " + ((40*16) + (horas-40)*20) + "$");}
	}

}
