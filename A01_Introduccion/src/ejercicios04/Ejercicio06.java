package ejercicios04;

import java.util.Scanner;

/*Ingresando un valor entero, muestre por pantalla sus dígitos en orden inverso, por ejemplo: 
INGRESO: 3589, SALIDA: 9853.*/

public class Ejercicio06 {
	public static void main(String[] args) {
		System.out.println("Dame un numero de varias cifras:");
		Scanner teclado = new Scanner(System.in);
		double ini = teclado.nextDouble();
		teclado.nextLine();
		
		double length = ini;
		int l = 0;
		// Contamos cifras
		while (length > 0) {
			length = Math.floor(length/10);
			l++;
		}
		
		System.out.println(l);
		String sol = "";
		int num = 0;
		//Bucle que almacena de derecha a izquierda
		for (int i = 1; i<=l; i++) {
			num = (int) ini%10;
			ini = Math.floor(ini/10);
			sol = sol + num;
		}
		System.out.println(sol);
		
		
	}
}
