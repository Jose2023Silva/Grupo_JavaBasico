package org.moure.grupoJava.EjeResueltosComunidad.sebasMora;
import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args){
        float nota1,nota2,nota3;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la primera nota: ");
        nota1 = entrada.nextFloat();
        System.out.print("Digite la segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.print("Digite la tercera nota: ");
        nota3 = entrada.nextFloat();
        entrada.close();

        float suma = nota1+nota2+nota3;

        System.out.println("La suma es: "+suma);
    }
}
