package org.moure.grupoJava.EjeResueltosComunidad.sebasMora;
import java.util.Scanner;

public class condicional1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int num = entrada.nextInt();

        if(num%10==0){
            System.out.println("El número es múltiplo de 10");
        }else {
            System.out.println("El número no es múltiplo de 10");
        }
    }
}
