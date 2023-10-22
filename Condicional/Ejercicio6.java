package Condicional;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribir el 1. número entero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Escribir el 2. número entero: ");
		int numero2 = entrada.nextInt();
		
		if ((numero1 % 2 == 0) && (numero2 % 2 == 0)) {System.out.println("Son pares los numeros " + numero1 + " y " + numero2);}
		  else if ((numero1 % 2 != 0) && (numero2 % 2 != 0)) {System.out.println("Son impares los numeros " + numero1 + " y " + numero2);}
		      else {System.out.println("Ambos numeros no hacen pareja como pares o impares.");}
	}

}
