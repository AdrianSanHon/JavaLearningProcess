package ejercicios02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void ejecute() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tu dame numeros que te digo el mayor, venga, empieza!");
		
		double mayor = teclado.nextDouble(); // Como es el primero, pues se aprovecha pa inicializar mayor
		double menor = mayor;
		
		teclado.nextLine();
		
		String respuesta = "s";
		System.out.println("Quieres seguir dandome numeros?(s/n)");
		respuesta = teclado.nextLine();
		
		double num;  // este va a ser el que se meta por teclado
		
		while (respuesta.equals("s")) {
			
			System.out.println("Dameloh!");
			num = teclado.nextDouble();
			teclado.nextLine();
			mayor = num>mayor? num:mayor;
			menor = num<menor? num:menor;
			System.out.println("Quieres seguir dandome numeros?(s/n)");
			respuesta = teclado.nextLine();
			
		}
		
		System.out.println("El mayor numero de los que me has dado es el " + mayor + " y el menor es el " + menor);
			
		
	}
	public static void main(String[] args) {
		ejecute();
	}
}
