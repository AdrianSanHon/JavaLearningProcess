package ejercicios03;

import java.util.Scanner;

/* El programa generará un número aleatorio entre 0 y 100 y le pedirá al usuario que lo 
 * adivine. Cuando el usuario ingrese el número para ver si acertó, el programa le indicará si 
 * el número a adivinar es mayor, menor o bien si acertó. Cuando acierte, finaliza.
 */

public class Ejercicio03 {
	public static void main(String[] args) {
		int sol = (int)(Math.random()*100);
		
		System.out.println("En qué numero estoy pensando (Natural de 0 a 100)?");
		Scanner teclado = new Scanner(System.in);
		int user = teclado.nextInt();
		teclado.nextLine();
		while (user != sol) {
			System.out.println("Será el " + user + ".......NOO!!!!");
			if (user>sol) System.out.println("Prueba con uno mas pequeño....");			
			else System.out.println("Prueba con uno mas grande....");
			user = teclado.nextInt();
			teclado.nextLine();
		}
		System.out.println("YASSSS!!!! Estaba pensando en el " + sol + " :3");
	}
}
