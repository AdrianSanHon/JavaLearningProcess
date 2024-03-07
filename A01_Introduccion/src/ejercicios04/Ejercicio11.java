package ejercicios04;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Le voy a pedir una fecha. Digame el numero de dia:");
		int d = teclado.nextInt();
		System.out.println("Digame el numero de mes:");
		int m = teclado.nextInt();
		System.out.println("Digame el año:");
		int y = teclado.nextInt();
		String test = "La fecha no es valida";
		
		do 
		{
			if (m == 2 && d > 28) {
				test = "La fecha no es valida";
			}else {
				if (m%2==0) {
					if(m > 8 && d < 31) test = "La fecha es valida";
					else if(m < 8 && d < 30) test = "La fecha es valida";					
				} else if (m%2!=0) {
					if(m > 8 && d < 30) test = "La fecha es valida";	
					else if(m < 8 && d > 31) test = "La fecha es valida";					
				}
			}
		
			System.out.println(test);
			if (test.equals("La fecha no es valida")) {
				System.out.println("Digame el año");
				y = teclado.nextInt();
				System.out.println("Digame el mes");
				m = teclado.nextInt();
				System.out.println("Digame el dia");
				d = teclado.nextInt();
			}
		}while(test.equals("La fecha no es valida"));
		
	}
	
}
