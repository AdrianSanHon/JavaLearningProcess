package ejercicios02;

import java.util.Scanner;

public class Ejercicio14 {
	/*
	 * Escribir un programa que pida al usuario un número entero positivo y muestre por 
	 * pantalla la cuenta atrás desde ese número hasta cero separados por comas.
	 * 
	 */
	
	public static void ejecute() {
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Ingrese un numero entero positivo:");
		int num = teclado.nextInt();
		teclado.nextLine();
		String sol = "";
		
		while (num>=1) {
			sol = sol + num +",";
			num -= 1;
		}
		sol = sol + "0......PUM!!!!";
		System.out.println(sol);		
	}
	public static void main(String[] args) {
		ejecute();
	}
}
