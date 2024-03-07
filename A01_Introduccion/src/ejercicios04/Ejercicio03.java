package ejercicios04;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el lado del cuadrado vacio que quieres que te dibuje:");
		int l = teclado.nextInt();
		teclado.nextLine();
		
		String sq = "";
		for (int i = 1; i <= l ; i++) {
			
			
			if (i == 1 || i == l) {		
				// Primer y ultimo nivel, todo * (en realidad "* ")
				for (int j = 1; j<= l; j++) {
					sq = sq + "* ";
				}
				sq = sq + "\n";	
			} else {
				// Niveles intermedios, empiezan con * (en realidad "* ")
				sq = sq + "* ";
				// Se añaden l-2 espacios (en realidad el doble para que quede bonito)
				for(int j = 1; j<= l-2; j++) {
					sq = sq + "  ";						
				}
				// Acaba con * (en realidad "* ")
				sq = sq + "*\n";						
			}
			
		}
		
		System.out.println("Aquí tienes un cuadrado vasio de lado " + l + ": ");
		System.out.println(sq);
		
	}
}
