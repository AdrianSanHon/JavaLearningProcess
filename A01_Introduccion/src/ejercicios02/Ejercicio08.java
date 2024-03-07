package ejercicios02;

import java.util.Scanner;

public class Ejercicio08 {

	/* Escribir un programa que imprima todos los números pares entre dos números que se le 
pidan al usuario */
	
	public static void ejecute(){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		int num1 = teclado.nextInt();
		System.out.println("Dame otro numero:");
		int num2 = teclado.nextInt();
		int aux = 0;
		
		if (num2<num1) {
			aux = num1; num1=num2 ; num2 = aux;};
		
		String sol = "Numeros pares entre " + num1 + " y " + num2 + " --> ";
		
		int inicio = ( num1%2==0 ? num1:(num1+1) ); //
		
		
		for (int i = inicio ; i <= num2 ; i+=2) {
			
			sol = sol + i +"; ";
		}
		
		System.out.println(sol);
		
	}
	public static void main(String[] args) {
		ejecute();
	}
}
