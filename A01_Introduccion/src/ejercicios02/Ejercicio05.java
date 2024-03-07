package ejercicios02;

import java.util.Scanner;

public class Ejercicio05 {

	public static void ejecute() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tu dame numeros que te cuento los positivos que me des, venga, empieza!");
		
		double numero = teclado.nextDouble(); 
		double pos = 0; //Contador de positivos
		
		if (numero > 0) pos +=1; // Si num es positivo, pos aumenta
		
		teclado.nextLine();
		
		String respuesta = "s";
		System.out.println("Quieres seguir dandome numeros?(s/n)");
		respuesta = teclado.nextLine();
		
		 
		while (respuesta.equals("s")) {
			
			System.out.println("Dameloh!");
			numero = teclado.nextDouble();
			teclado.nextLine();
			if (numero > 0) pos +=1;
			System.out.println("Quieres seguir dandome numeros?(s/n)");
			respuesta = teclado.nextLine();
			
		}
		
		System.out.println("Me has dado un total de " + pos + " numeros positivos.");
			
		
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}

