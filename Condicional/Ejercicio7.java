package Condicional;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduccir el 1 número entero: ");
		int numero1 = entrada.nextInt();
		System.out.println("Introduccir el 2 número entero: ");
		int numero2 = entrada.nextInt();
		System.out.println("Introduccir el 3 número entero: ");
		int numero3 = entrada.nextInt();
		
		if ((numero1 >= numero2) && (numero1 >= numero3) && (numero2 >= numero3)) {
			System.out.println("El orden es: " + numero1 + " - " + numero2 + " - " + numero3);
		}
		if ((numero1 >= numero2) && (numero1 >= numero3) && (numero3 > numero2)) {
			System.out.println("El orden es: " + numero1 + " - " + numero3 + " - " + numero2);			
		}
		if ((numero2 > numero1) && (numero2 >= numero3) && (numero1 >= numero3)) {
			System.out.println("El orden es: " + numero2 + " - " + numero1 + " - " + numero3);
		}
		if ((numero2 > numero1) && (numero2 >= numero3) && (numero3 > numero1)) {
			System.out.println("El orden es: " + numero2 + " - " + numero3 + " - " + numero1);
		}
		if ((numero3 > numero1) && (numero3 > numero2) && (numero1 >= numero2)) {
			System.out.println("El orden es: " + numero3 + " - " + numero1 + " - " + numero2);
		}
		if ((numero3 > numero1) && (numero3 > numero2) && (numero2 > numero1)) {
			System.out.println("El orden es: " + numero3 + " - " + numero2 + " - " + numero1);
		}
	}
}
