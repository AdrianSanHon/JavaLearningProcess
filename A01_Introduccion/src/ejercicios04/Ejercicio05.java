package ejercicios04;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		System.out.println("Dame un numero de varias cifras:");
		Scanner teclado = new Scanner(System.in);
		double ini = teclado.nextDouble();
		teclado.nextLine();
		int l = 0;
		double length = ini;
		
		// Contamos cifras
		while (length > 0) {
			length = Math.floor(length/10);
			l++;
		}
		// System.out.println(l);
		//Bucle que imprime de izq a derecha
		for (int i = 1; i<l; i++) {
			System.out.println(Math.floor(ini/Math.pow(10, l-i)));
			ini = ini%Math.pow(10, l-i);
			
		}
		
		System.out.println(ini);
		
		
		}		
	}