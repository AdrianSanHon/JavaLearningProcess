package ejercicios02;

import java.util.Scanner;

/*
 * Siguiendo la misma metodología de carga, calcular la cantidad de valores >= 0 y la cantidad 
 * menores que 0.
 */

public class Ejercicio06 {

	public static void ejecute() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tu dame numeros que te digo los positivos y los negativos, venga, empieza!");
		
		double pos = 0;
		double neg = 0;
		
		double num = teclado.nextDouble();
		teclado.nextLine();
		if (num > 0) pos += 1;
		else neg +=1;
		
		String respuesta = "";
		
		System.out.println("Quieres seguir dandome numeros?(s/n)"); 
		respuesta = teclado.nextLine();
		
		while (respuesta.equals("s")) {
			
			System.out.println("Dameloh!");
			num = teclado.nextDouble();
			teclado.nextLine();
			if (num > 0) pos += 1;
			else neg +=1;
			System.out.println("Quieres seguir dandome numeros?(s/n)"); 
			respuesta = teclado.nextLine();
			
		}
			
		System.out.println("Me has dado un total de " + pos + " numeros positivos y " + neg + " numeros negativos");
			
		
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}
