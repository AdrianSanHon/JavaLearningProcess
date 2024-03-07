package com.cursojava.introduccion;

import java.util.Scanner;

public class AIntroduccionTeclado {
	public static void main(String[] arg) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Ingresa tu nombre: ");
		
		String nombre = teclado.nextLine();
		
		System.out.println("Hola " + nombre + ", bienvenido.!!");
		
		teclado.close();
		
	}

}
