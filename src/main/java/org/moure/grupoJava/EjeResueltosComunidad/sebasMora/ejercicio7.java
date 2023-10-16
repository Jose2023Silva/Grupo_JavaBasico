package org.moure.grupoJava.EjeResueltosComunidad.sebasMora;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){
        /*
        * Ejercicio 7: Construir un programa que, dado un número total de horas,
        * devuelve el número de semanas, días y horas equivalentes. Por ejemplo,
        * dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
        * */
        int horas,semanas,dias,horasFaltantes;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el número de horas: ");
        horas = entrada.nextInt();
        entrada.close();

        semanas = horas / 168;
        dias = horas%168 / 24;
        horasFaltantes = horas%24;

        System.out.println("Los semanas son: "+semanas);
        System.out.println("Los días son: "+dias);
        System.out.println("Las horas son: "+horasFaltantes);

    }
}
