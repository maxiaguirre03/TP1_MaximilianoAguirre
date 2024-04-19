package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero a multiplicar: ");
		int numero = scanner.nextInt();
		
		if (numero<0 || numero>9) {
		System.out.println("El numero ingresado debe estar entre [0-9]");
		return;

	}
        int i=1;
        System.out.println("la tabla de cada numero; " + numero);
		for (i=1; i<=10; i++) {
			System.out.println(numero+"*" + i + "es: " + (numero * i));

}
}
}