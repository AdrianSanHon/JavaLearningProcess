package ejercicios04;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
	
		System.out.println("Cuantos niveles quieres que tenga la piramide?");
		Scanner teclado = new Scanner(System.in);
		int nlvl = teclado.nextInt();
		System.out.println("Estas son las piramides de " + nlvl + "niveles.");
		// Piramide 1 con pendiente negativa
		String lvl = "";
		for (int i = 1; i <= nlvl; i++) {
			for (int j = 1; j<=i ; j++) {
				lvl = lvl + "*";
			}
			lvl = lvl + "\n";
		}
		System.out.println(lvl);
		// Piramide 5 con pendiente positiva
		lvl = "";
		for (int i = 1; i <= nlvl; i++) {
			for (int j = 1; j<=nlvl-(i-1) ; j++) {
				lvl = lvl + "*";
			}
			lvl = lvl + "\n";
		}
		System.out.println(lvl);
		// Piramide 5 con pendiente negativa
		lvl = "";
		for (int i = 1; i <= nlvl; i++) {
			for (int j = 1; j <= i-1 ; j++ ) {
				lvl = lvl + " ";
			}
			for (int j = 1; j<=nlvl-(i-1) ; j++) {
				lvl = lvl + "*";
			}
			lvl = lvl + "\n";
		}
		System.out.println(lvl);
		//Piramide 1 con pendiente positiva
		lvl = "";
		for (int i = 1; i <= nlvl; i++) {
			for (int j = 1; j <= nlvl-i ; j++ ) {
				lvl = lvl + " ";
			}
			for (int j = 1; j<=i; j++) {
				lvl = lvl + "*";
			}
			lvl = lvl + "\n";
		}
		System.out.println(lvl);
		
		
	}	
	
	
	
}
