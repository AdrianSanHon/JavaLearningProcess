package com.cursojava.introduccion.teoria.metodos;

public class Metodos01 {

	public static double pow(double base, double exp) {
		double pow = 1;
		for(int i = 1; i<= exp; i++) {
			pow = pow * base;
		}
		return pow;
	}
	public static void main(String[] args) {
		System.out.println(pow(2,10));
	}
}


