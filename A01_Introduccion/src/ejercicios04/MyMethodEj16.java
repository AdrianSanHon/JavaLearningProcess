
package ejercicios04;

import java.util.Scanner;

public class MyMethodEj16 {

	static boolean valDate (int y, int m, int d) {
		if (m == 2 && d > 28) {
			return false;
		}else {
			if (m%2==0) {
				if(m > 8 && m < 13 && d <= 31) return true;												 
				else if(m < 8 && m > 0 && d <= 30) return true;										
			} else if (m%2!=0) {
				if(m > 8 && m < 13 && d <= 30) return true;									
				else if(m < 8 && m > 0 && d <= 31) return true;					
			}
		}
		return false;
	}
	
	static int countD( int y, int m, int d) {
		int totalD = d + y *365;
		
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
		
		return totalD;
	}
	public static void main(String[] args) {
		
		int d, m, y, totalD;
		Scanner teclado = new Scanner(System.in);
		do {
			
			System.out.println("Digame el año");
			y = teclado.nextInt();
			System.out.println("Digame el mes");
			m = teclado.nextInt();
			System.out.println("Digame el dia");
			d = teclado.nextInt();
			String test = "La fecha no es valida";
			totalD = 0;
			System.out.println(valDate(y,m,d)?"La fecha es valida":"La fecha no es valida");
		} while (!valDate(y,m,d)); 
		int totalD1 = countD(y,m,d);
		do {
			System.out.println("Digame el año2");
			y = teclado.nextInt();
			System.out.println("Digame el mes2");
			m = teclado.nextInt();
			System.out.println("Digame el dia2");
			d = teclado.nextInt();
			String test = "La fecha no es valida";
			totalD = 0;
			System.out.println(valDate(y,m,d)?"La fecha es valida":"La fecha no es valida");
		} while (!valDate(y,m,d)); 
		
		int totalD2 = countD(y,m,d);
		
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
