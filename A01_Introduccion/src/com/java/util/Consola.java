package com.java.util;

import java.util.Scanner;

public class Consola {

	public static Scanner tec = new Scanner(System.in);
	
	public String leerCadena() {
		
		return tec.nextLine();
	}

	public static String leerCadena(String mensaje) {
		System.out.print(mensaje);
		return tec.nextLine();		
	}

	public static int leerInt() {
		//lee por teclado una linea completa que contiene un valor entero y lo devuelve
		int a =  tec.nextInt();
		tec.nextLine();
		return a;
	}

	public static int leerInt(String mensaje) {
		//lee por teclado una linea completa que contiene un valor entero y lo devuelve, mostrando previamente como mensaje de lectura 'mensaje'
		System.out.print(mensaje);
		int a = tec.nextInt();
		tec.nextLine();
		return a;
	
	}
	public static void mostrarRedondeado(double num, int decimales) {
		System.out.println(Math.round(num * Math.pow(10, (decimales)))/Math.pow(10, decimales));
	}
	
	public static void main(String[] args) {
		Consola.mostrarRedondeado(12.5596859110, 2);
	}
}

