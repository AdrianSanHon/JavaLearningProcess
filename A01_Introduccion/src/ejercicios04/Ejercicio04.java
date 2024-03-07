package ejercicios04;

import java.util.Scanner;

// Ingresando un número entero por teclado de 4 cifras, mostrar sus dígitos uno por línea.

public class Ejercicio04 {
	public static void main(String[] args) {
		System.out.println("Dame un numero de 4 cifras:");
		Scanner teclado = new Scanner(System.in);
		double ini = teclado.nextDouble();
		teclado.nextLine();
		int l = 4;
		
		for (int i = 1; i<l; i++) {
			System.out.println(Math.floor(ini/Math.pow(10, l-i)));
			ini = ini%Math.pow(10, l-i);
			
		}
		System.out.println(ini);
		
	}
		
}
	

