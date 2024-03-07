package ejercicios04;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
	 
		System.out.print("Bienvenido a la supercalculadora\nDame un valor\n");
		double num1 = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Ahora dame un operador de los 4 basicos (+,-,*,/)\n");
		String operador = teclado.nextLine();
		System.out.print("Dame el segundo valor\n");
		double num2 = teclado.nextDouble();
	 
		double sol = 0;
	 
		switch (operador) {
	 		case "+": sol = num1 + num2;
	 			break;
	 		case "-": sol = num1 - num2;
	 			break;
	 		case "*": sol = num1 * num2;
	 			break;
	 		case "/": sol = num1 / num2;	 
	 			break;
		}
		System.out.print("La solucion de <<" + num1 + " " + operador + " " + num2 + ">> es <<" + sol + ">>. " );
	}	 
	
}
