package Condicional;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, introduccir un numero entero entre el 0 al 99999: ");
		int numero = entrada.nextInt();
		
		if ((numero > 99999) || (numero < 0)) {System.out.println("Error, el numero entrado, " + numero + " esta fuera del rango 0 a 99999");}
		else {
			String digitos = Integer.toString(numero);
			System.out.println("El numero: " + numero + "  tiene " + digitos.length() + " digitos.");}
		

	}

}
