package ejercicios02;

import java.util.Scanner;

// Escriba un programa que pida un número entero mayor que cero y que escriba sus divisores.

public class Ejercicio15 {

	public static void ejecute() {
		System.out.println("Ingrese un numero entero positivo:");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		teclado.nextLine();
		
		
		String sol = "1, ";
		
		for (int i = 2; i < num ; i++) {
		
			if (num%i == 0) {
				sol = sol + i + ", ";
			}
			
		}
		
		sol = sol + num + ".";
		System.out.println("Los divisores de "+ num + " son: " + sol);
		
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}
