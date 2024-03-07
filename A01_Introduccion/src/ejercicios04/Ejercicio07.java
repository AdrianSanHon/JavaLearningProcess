package ejercicios04;

import java.util.Scanner;

// Determine si un valor entero ingresado por teclado es un palíndromo (capicúa).
public class Ejercicio07 {
	
	//Hacemos el ejercicio pero con un metodo que recibe valor entero y dice si es o no capicua:
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero natural:");
		
		int num = teclado.nextInt();
		
		int totalNum = 0;
		int aux = num;
		while (aux > 0) {
			aux = (int)Math.floor(aux/10);
			totalNum ++;
		}
		aux = num;
		int reverse = 0;
		for (int i = 0; i < totalNum ; i++) {
			reverse = (reverse*10)+(aux%10);
			aux = (int) Math.floor(aux/10);
		}
		System.out.println(reverse);
		
		
		
	}

}
