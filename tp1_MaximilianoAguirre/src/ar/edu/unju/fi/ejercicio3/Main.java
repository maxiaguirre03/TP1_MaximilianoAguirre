package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Crear un objeto scanner para el ingreso del usuario
		Scanner scanner = new Scanner(System.in);
		
		//solicitar al usuario que ingrese un N entero
		System.out.println("Ingrese un numero entero: ");
		int numero = scanner.nextInt();
		
		//verificar si el numero es par o impar
		if (numero % 2 == 0) {
         int resultado = numero * 3;//multp num por 3
         System.out.println("el numero es par. El triple es: " +resultado);
	} else { //si es impar
	           int resultado = numero * 2;//calcula el doble 
	           System.out.println("es impar. Su doble es: "+resultado);
	}
	}
		
}
