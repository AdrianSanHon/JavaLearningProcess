package ejercicios02;

import java.util.Scanner;

public class Ejercicio12 {

	public static void ejecute() {
		
		//Dado un número entero n positivo, imprimir su triangular
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido al calculador de numeros triangulares. Dame un numero:");
		int num = teclado.nextInt();
		String tri = "1"; 
		int res = 1;
		for (int i = 2; i<=num ; i++) {
			
			tri = tri + "+" + i;  //Acumulador producto en string para que quede indicado
			res = res + i;			//Acumulador real de producto 
		
		}		
		System.out.println("Numero triangular de indice " + num + " = " + tri + " = " + res ); // Mostrar solucion
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}
