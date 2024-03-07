package ejercicios02;

import java.util.Scanner;

public class Ejercicio01 {
	public static void ejecute() {
		
		Scanner teclado = new Scanner (System.in);
		
		int limite = 0;
		
		System.out.println("Hola! Cuantos numeros queremos imprimir hoy?");
		
		limite = teclado.nextInt();
		
		System.out.println("Perfecto! Imprimamos " + limite + " numeros!! Dameloh premoh:");
		
		for (int i = 1; i<=limite; i++) {
			int numero = 0;
			numero = teclado.nextInt();
			System.out.println("Te imprimo el: " + numero);
		}		
		System.out.println("Y eso es todo amigos!!!!");
	}
	
	public static void main(String[] args) {
		ejecute();
	}
}
