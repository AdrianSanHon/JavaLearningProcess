package ejercicios02;

import java.util.Scanner;

//Dado un número entero n, imprimir su tabla de multiplicar del 1 al 9.

public class Ejercicio10 {

	public static void ejecute() {
		System.out.println("Las tablas de multiplicar. Ingresar numero:");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		teclado.nextLine();
		String sol = "";
		int prod = 1;
		for (int i = 1; i<=9 ; i++) {
			prod = num * i;
			sol = sol + num + " * " + i + " = " + prod + "\n";
		}
		System.out.println(sol);
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}
