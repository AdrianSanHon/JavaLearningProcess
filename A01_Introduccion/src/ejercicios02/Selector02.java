package ejercicios02;

import java.util.Scanner;

public class Selector02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String respuesta = "s";
		while (respuesta.equals("s")) {
			System.out.println("Seleccione ejercicio del 1 al 16:");
			int select = teclado.nextInt();
			teclado.nextLine();
			
			switch(select){			
				case 1:
					System.out.println("Imprimir por pantalla los números 1 hasta un número ingresado por teclado:");
					Ejercicio01.ejecute();
					break;
				case 2:
					System.out.println("Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por teclado");
					Ejercicio02.ejecute();
					break;
				case 3:
					System.out.println("De una lista de n números ingresados por teclado, imprimir el mayor");
					Ejercicio03.ejecute();
					break; 
				case 4:
					System.out.println("De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.");
					Ejercicio04.ejecute();
					break; 
				case 5:
					System.out.println("Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos.");
					Ejercicio05.ejecute();
					break; 
				case 6:
					System.out.println("Siguiendo la misma metodología de carga, calcular la cantidad de valores >= 0 y la cantidad de menores que 0.");
					Ejercicio06.ejecute();
					break; 
				case 7:
					System.out.println("Dado un número entero n positivo, imprimir su factorial");
					Ejercicio07.ejecute();
					break; 
				case 8:
					System.out.println(" Escribir un programa que imprima todos los números pares entre dos números ");
					Ejercicio08.ejecute();
					break; 
				case 9:
					System.out.println("Solicitando al usuario la cantidad de números a procesar, emitir el siguiente informe:");
					Ejercicio09.ejecute();
					break; 
				case 10:
					System.out.println("Dado un número entero n, imprimir su tabla de multiplicar del 1 al 9");
					Ejercicio10.ejecute();
					break; 
				case 11:
					System.out.println("Escribir un programa que imprima las tablas del 1 al 9.");
					Ejercicio11.ejecute();
					break; 
				case 12:
					System.out.println(" Escribir un programa que reciba un número n e imprima los primeros n números triangulares, junto con su índice");
					Ejercicio12.ejecute();
					break; 
				case 13:
					System.out.println("Escribir un programa que imprima por pantalla todas las fichas de dominó, de una por línea y sin repetir");
					Ejercicio13.ejecute();
					break; 
				case 14:
					System.out.println("Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas");
					Ejercicio14.ejecute();
					break; 
				case 15:
					System.out.println(" Escriba un programa que pida un número entero mayor que cero y que escriba sus divisores");
					Ejercicio15.ejecute();
					break;
				case 16:
					System.out.println("Escribir un programa que pida al usuario un número entero positivo mayor que 2 y muestre por pantalla si es un número primo o no");
					Ejercicio16.ejecute();
					break;
					
				
			}
			System.out.println("Quieres ver otro ejercicio?(s/n)");
			respuesta = teclado.nextLine();
				
			}
			System.out.println("Fin del selector.");
		}
	}
	

