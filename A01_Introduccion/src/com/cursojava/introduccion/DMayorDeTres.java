package com.cursojava.introduccion;

import java.util.Scanner;

public class DMayorDeTres {
	
	public static void main(String[] arg) {
		
		int num1, num2, num3, mayor;
		mayor = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el primer valor (num1):");
		num1 = teclado.nextInt();
		
		System.out.println ("Dame el segundo valor (num2)");
		num2 = teclado.nextInt();
		
		System.out.println ("Dame el tercer valor (num3)");
		num3 = teclado.nextInt();
		
		if (num1 > num2 && num1 > num3) mayor = num1;
		else if (num2 > num3) mayor = num2;
		else mayor = num3;
		
		
		System.out.print("El mayor numero de esos tres valores es: " + mayor);
		
		teclado.close();
		
	}

}








