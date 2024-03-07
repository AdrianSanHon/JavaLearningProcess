package ejercicios02;

import java.util.Scanner;

public class Ejercicio16 {

	
	/*Escribir un programa que pida al usuario un número entero positivo mayor que 2 y 
	 *muestre por pantalla si es un número primo o no
	 */
	public static void ejecute() {
		
		System.out.println("Ingrese un numero entero positivo mayor que dos");
		Scanner teclado = new Scanner(System.in);
		double num = teclado.nextInt();
		teclado.nextLine();
		
		while (num < 2) {
			System.out.println("Numero no valido. Ingrese otro numero");
			num = teclado.nextInt();
			teclado.nextLine();
		}
		int i = 2;
		for (i = 2; i<=num;i++) {
			if (num%i == 0) break;
		}
		
		System.out.println("Ese numero "+ (i==num? "es":"no es") + " primo.");
		
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}
