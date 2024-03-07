package com.cursojava.introduccion;

import java.util.Scanner;

public class CMayorDeDos {

	public static void main (String [] arg) {
		
		int num1, num2, mayor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa un valor1");
		num1 = teclado.nextInt();
		
		System.out.print("Ingresa un valor2");
		num2 = teclado.nextInt();
		
		if (num1 > num2) mayor = num1;
		else mayor = num2;
		
		
		
		
	}
	
}
