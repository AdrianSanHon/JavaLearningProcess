package ejercicios04;

import java.util.Scanner;

/* Escriba un programa que lea el lado de un cuadrado por teclado y a continuación lo 
muestre por pantalla en forma de asteriscos. Por ejemplo, ingresado el valor 4 la salida 
será: */
public class Ejercicio02 {

		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digame el lado del cuadrado:");
			int l = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Aquí tienes un cuadrado de lado " + l + ":" );
			String sq = "";
			for (int i = 1; i<=l; i++) {
				for (int j = 1; j<=l; j++) {
					sq = sq + "* ";
				}
				sq = sq + "\n";
			}
			System.out.println(sq);
		}
}
