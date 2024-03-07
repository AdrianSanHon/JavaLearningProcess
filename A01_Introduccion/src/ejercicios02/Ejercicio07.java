package ejercicios02;

import java.util.Scanner;

public class Ejercicio07 {

	public static void ejecute() {
		
		//Dado un número entero n positivo, imprimir su factorial.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido al calculador de factoriales. Dame un numero:");
		int num = teclado.nextInt();
		String prod = "1"; 
		int res = 1;
		for (int i = 2; i<=num ; i++) {
			
			prod = prod + "*" + i;  //Acumulador producto en string para que quede indicado
			res = res * i;			//Acumulador real de producto 
		
		}
		
		System.out.println(num+ "! = " + prod + " = "+ res ); // Mostrar solucion
	
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}
