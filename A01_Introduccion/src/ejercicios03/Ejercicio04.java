package ejercicios03;
/*
 * 
 * Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. En 
 * cada paso, el programa propone un número y el usuario debe contestar, introduciendo su 
 * contestación como dato, si ha acertado, o bien si el número que ha propuesto el 
 * ordenador es mayor o es menor que el que tenía pensado. Por ejemplo, ingresando
 * 
 * */

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {

		
		
		System.out.println("Piensa en un numero.... (Natural de 0 a 100)");
		Scanner teclado = new Scanner(System.in);
		int ia = 50;
		System.out.println("Es el ..... "+ ia +"?!");
		int grt = 100;
		int low = 0;
		int ans = teclado.nextInt();
		int tries = 0;
		teclado.nextLine();
		while (ans != 0) {
			System.out.println("No? Vaya....");
			
			switch (ans){
				case -1:
					grt = ia;
					;
					break;
				case 1:
					low = ia;
					break;
			}
			
			ia = (low+grt) / 2;
			tries ++;
			System.out.println("Es el ..... "+ ia +"?!");	
			ans = teclado.nextInt();
			teclado.nextLine();
		}
		System.out.println("YASSSS!!!! Y solo me ha costado " + tries + " intentos !!!");
		
		
	}
}
