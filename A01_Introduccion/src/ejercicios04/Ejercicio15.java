package ejercicios04;

import java.util.Scanner;

public class Ejercicio15 {

	/*
	 * Solicite al usuario dos fechas (día1, mes1, año1, día2, mes2, año2), indicar el tiempo 
	 * transcurrido entre ambas, en años, meses y días sin tener en cuenta años bisiestos.
	 */
	
	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digame el año1");
		int y = teclado.nextInt();
		System.out.println("Digame el mes1");
		int m = teclado.nextInt();
		System.out.println("Digame el dia1");
		int d = teclado.nextInt();
		String test = "La fecha no es valida";
		int totalD = 0;
		
		
		do{
			
			if (m == 2 && d > 28) {
				test = "La fecha no es valida";
			}else {
				if (m%2==0) {
					if(m > 8 && m < 13 && d <= 31) test = "La fecha es valida";												 
					else if(m < 8 && m > 0 && d <= 30) test = "La fecha es valida";										
				} else if (m%2!=0) {
					if(m > 8 && m < 13 && d <= 30) test = "La fecha es valida";									
					else if(m < 8 && m > 0 && d <= 31) test = "La fecha es valida";					
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
		
		
		totalD = d + y*365;
		switch(m) {
		case 12:
			totalD +=30; 
		case 11:
			totalD +=31; 
		case 10:
			totalD +=30; 
		case 9:
			totalD +=31; 
		case 8:
			totalD +=30; 
		case 7:
			totalD +=31; 
		case 6:
			totalD +=31; 
		case 5:
			totalD +=30; 
		case 4:
			totalD +=31; 
		case 3:
			totalD +=28; 
		case 2:
			totalD +=31; 
		}
		
		int totalD1 = totalD;
		// System.out.println("Transformado a dias: " + totalD1);
		
		System.out.println("Digame el año2");
		y = teclado.nextInt();
		System.out.println("Digame el mes2");
		m = teclado.nextInt();
		System.out.println("Digame el dia2");
		d = teclado.nextInt();
		test = "La fecha no es valida";
		totalD = 0;
		
		do{
			
			if (m == 2 && d > 28) {
				test = "La fecha no es valida";
			}else {
				if (m%2==0) {
					if(m > 8 && m < 13 && d <= 31) test = "La fecha es valida";												 
					else if(m < 8 && m > 0 && d <= 30) test = "La fecha es valida";										
				} else if (m%2!=0) {
					if(m > 8 && m < 13 && d <= 30) test = "La fecha es valida";									
					else if(m < 8 && m > 0 && d <= 31) test = "La fecha es valida";					
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
		
		totalD = d + y*365;
		switch(m) {
		case 12:
			totalD +=30; 
		case 11:
			totalD +=31; 
		case 10:
			totalD +=30; 
		case 9:
			totalD +=31; 
		case 8:
			totalD +=30; 
		case 7:
			totalD +=31; 
		case 6:
			totalD +=31; 
		case 5:
			totalD +=30; 
		case 4:
			totalD +=31; 
		case 3:
			totalD +=28; 
		case 2:
			totalD +=31; 
		}
		int totalD2 = totalD;
		// System.out.println("Transformado a dias: " + totalD2);
		
		//Ahora se calcula la diferencia de fecha en dias y transformamos la diferencia de dias a "dias, meses, años"
		double dateDiff = Math.abs(totalD1-totalD2);
		// System.out.println("Han transcurrido estos dias entre ambas fechas -> " + dateDiff);
		double yr = Math.floor(dateDiff /365);
		// System.out.println("Han transcurrido estos años entre ambas fechas -> " + yr);
		double mth = Math.floor((dateDiff%365)%30);
		// System.out.println("Han transcurrido estos meses entre ambas fechas -> " + mth);
		double da = (dateDiff%365)%30;
		// System.out.println("Han transcurrido estos dias entre ambas fechas -> " + da);
		
		System.out.println("Han transcurrido un total de " + (int) yr + " años " + (int) mth +" meses y "+ (int) da +" dias entre ambas fechas.");
		
		
	}		
}


