package ejercicios03;

import java.util.Scanner;

/*
 * Se solicitará al usuario que ingrese números reales para procesar. Luego de ingresar cada
 * número, se le preguntará si quiere ingresar más o no, leyendo el carácter ‘s’ o ‘n’. Cuando 
 * indique que no ingresa más números. Mostrar la cantidad de valores ingresados, el primer 
 * valor, el último, el mayor y el menor.
 * 
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		
Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame numeros:");
		int num = teclado.nextInt();
		teclado.nextLine();
		
		String respuesta = "";
		
		int mayor = num; int lugar_mayor = 1;
		int menor = num; int lugar_menor = 1;
		int first = num;
		int last = num;
		
	
		
		System.out.println("Quieres seguir dandome numeros ?(s/n)");
		respuesta = teclado.nextLine();
		
		
		while (respuesta.equals("s")){
			System.out.println("Dameloh");
			num = teclado.nextInt();
			teclado.nextLine();
			
			if (num>mayor) mayor = num;
				else if (num<menor) menor = num;
				
			System.out.println("Quieres seguir dandome numeros ?");
			respuesta = teclado.nextLine();
		};
		
		
		
		System.out.println("El primer numero fue: " + first + "\n"
				+ "El ultimo numero fue: " + last+ "\n"
				+ "Mayor valor: " + mayor + "\n"
				+ "Menor valor: " + menor + ".");
	}
}
