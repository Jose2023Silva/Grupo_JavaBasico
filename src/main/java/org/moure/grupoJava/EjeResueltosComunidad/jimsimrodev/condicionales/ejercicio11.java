
/**
       * Ejercicio 11
       * Construir un programa que simule el funcionamiento de una calculadora
       * que puede realizar las cuatro operaciones aritméticas básicas (suma, resta,
       * producto y división) con valores numéricos enteros.
       * El usuario debe especificar la operación con el primer carácter del primer
       * parámetro de la línea de comandos.
       * S o s para la suma, R o r para la resta, P o p, M o M para el producto y
       * D o d para la división-
       */
import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero1;
        int numero2;
        int opcion;

        int suma;
        int resta;
        int multiplicacion;
        int division;

        String mensaje = "******* Escoge la Operacion a realizar *******";
        mensaje += "\n1. suma";
        mensaje += "\n2. Resta";
        mensaje += "\n3. Multiplicacion";
        mensaje += "\n4. Division";
        mensaje += "\n5. Salir...";

        try {
            System.out.println("Ingresa el primer numero");
            numero1 = leer.nextInt();

            System.out.println("Ingresa el segundo numero");
            numero2 = leer.nextInt();

            do {
                System.out.println(mensaje);
                opcion = leer.nextInt();

                switch (opcion) {

                    case 1 -> {
                        suma = numero1 + numero2;
                        System.out.println("La suma es = " + suma);
                    }

                    case 2 -> {
                        resta = numero1 - numero2;
                        System.out.println("La resta es = " + resta);
                    }

                    case 3 -> {
                        multiplicacion = numero1 * numero2;
                        System.out.println("La Multiplicacion es = " + multiplicacion);
                    }
                    case 4 -> {
                        division = numero1 / numero2;
                        System.out.println("La Division es = " + division);
                    }
                    case 5 -> {
                        System.out.println("Saliendo del programa hata pronto...");
                    }
                    default -> System.out.println("Ingrese una opcion valida entre (1-5)");
                }
            } while (opcion != 5);

        } catch (Exception e) {
            System.out.println("Error solo se aceptan numero enteros!");
        }
    }
}
