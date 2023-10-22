package Condicional;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduccir dia (del 1 al 30): ");
		int dia = entrada.nextInt();
		System.out.println("Introduccir mes (del 1 al 12): ");
		int mes = entrada.nextInt();
		System.out.println("Introduccir año (del 1 al 9999): ");
		int año = entrada.nextInt();
		
		if ((dia < 1) || (dia > 30)) {System.out.println("Error en dia introduccido: " + dia);}
		   else if ((mes < 1) || (mes > 12)) {System.out.println("Error en mes introduccido: " + mes);}
		      else if ((año < 1) || (año > 99999)) {System.out.println("Error en año introduccido: " + año);}
		        else {System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);}
		
	}

}
