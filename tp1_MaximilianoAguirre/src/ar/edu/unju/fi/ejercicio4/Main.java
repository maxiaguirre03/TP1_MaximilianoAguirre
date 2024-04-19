package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 10 para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Verificar si el número está dentro del rango [0, 10]
        if (numero < 0 || numero > 10) {
            System.out.println("El número debe estar dentro del rango [0, 10]");
            return;
        }

        int factorial = 1;
        int contador = numero;

        // Calcular el factorial usando un bucle while
        while (contador > 1) {
            factorial *= contador;
            contador--;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
