package ejercicios04;

import java.util.Scanner;

/*
 * Solicite al usuario una fecha e indicar los días que faltan hasta fin de año. 
 *(se supone que el año no es bisiesto)
 * 
 * */

public class Ejercicio14 {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digame el año");
		int y = teclado.nextInt();
		System.out.println("Digame el mes");
		int m = teclado.nextInt();
		System.out.println("Digame el dia");
		int d = teclado.nextInt();
		String test = "La fecha es no valida";
		int totalD = 0;
		
		
		do{
			
			
			if (m == 2 && d > 28) {
				test = "La fecha no es valida";
			}else {
				if (m%2==0) {
					if(m > 8 && d < 31) {
						test = "La fecha es valida";
						totalD += (31-d);
						} 
					else if(m < 8 && d < 30) {
						test = "La fecha es valida";
						totalD += (30-d);
						}
				} else if (m%2!=0) {
					if(m > 8 && d < 30) {
						test = "La fecha es valida";
						totalD += (30-d);
					}
					else if(m < 8 && d > 31) {
						test = "La fecha es valida";
						totalD += (31-d);
					}
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
		
		}while (test.equals("La fecha no es valida"));
		
		switch(m) {
		case 1:
			totalD +=28; 
		case 2:
			totalD +=31; 
		case 3:
			totalD +=30; 
		case 4:
			totalD +=31; 
		case 5:
			totalD +=30; 
		case 6:
			totalD +=31; 
		case 7:
			totalD +=31; 
		case 8:
			totalD +=30; 
		case 9:
			totalD +=31; 
		case 10:
			totalD +=30; 
		case 11:
			totalD +=31; 
		
		}
	
		System.out.println("Quedan un total de " + totalD + " dias para que se acabe el año " + y + ".");
		
		
	}		
}


