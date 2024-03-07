package ejercicios04;
import java.util.Scanner;


public class Ejercicio07Metodo {

// Determine si un valor entero ingresado por teclado es un palíndromo (capicúa).
	
//Hacemos el ejercicio pero con un metodo que recibe valor entero y dice si es o no capicua:
		public static boolean palindrom(int num) {
			
			
			int totalNum = 0;
			int aux = num;
			while (aux > 0) {
				aux = (int)Math.floor(aux/10);
				totalNum ++;
			}
			
			aux = num;
			int reverse = 0;
			for (int i = 0; i < totalNum ; i++) {
				reverse = (reverse*10)+(aux%10);
				aux = (int) Math.floor(aux/10);
			}

			return reverse == num;
		}
		
		
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduzca numero:");
			int num = teclado.nextInt();
			teclado.nextLine();
			if(Ejercicio07Metodo.palindrom(num))System.out.println("El numero " + num + " es un palindromo");
			else  System.out.println("El numero " + num + " no es un palindromo");
			
		
		}

	}

