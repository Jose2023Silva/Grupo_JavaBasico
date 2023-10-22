package Condicional;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduccir dia (del 1 al 30): ");
		int dia = entrada.nextInt();
		System.out.println("Introduccir mes (del 1 al 12): ");
		int mes = entrada.nextInt();
		System.out.println("Introduccir a�o (del 1 al 9999): ");
		int a�o = entrada.nextInt();
		
		if ((dia < 1) || (dia > 30)) {System.out.println("Error en dia introduccido: " + dia);}
		   else if ((mes < 1) || (mes > 12)) {System.out.println("Error en mes introduccido: " + mes);}
		      else if ((a�o < 1) || (a�o > 99999)) {System.out.println("Error en a�o introduccido: " + a�o);}
		        else {System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + a�o);}
		
	}

}
