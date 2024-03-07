package ejercicios02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void ejecute() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ahora te voy a imprimir los n primeros numeros naturales, dime cuantos quiereh:");
		int limite = teclado.nextInt();
		System.out.println("Aqui tienes los " + limite + " primeros numeros naturales:");
				
		for (int i = 1; i<=limite ; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("Y eso es todo amigos !!!");
	}
	
	public static void main(String[] args) {
		ejecute();
	}
	
}
