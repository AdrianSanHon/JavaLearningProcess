package com.cursojava.introduccion.teoria.metodos;

public class Metodos03Parametros {
	
	public static void cambia(int a) {
		a = 0;
		
	}
	public static void main(String[] args) {
		int a = 99;
		cambia(a);
		System.out.println(a);
	}
}
