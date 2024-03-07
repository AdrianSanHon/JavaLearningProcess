package com.cursojava.introduccion.teoria;

public class T04Switch {
	public static void main(String[] arg) {
		
		int dia = 1;
		int mes = 1;
		int cantDias = 0;
		
		
		if (mes < 8) {
			if (mes == 2) cantDias += (28-dia);
			else {if (mes % 2 == 0) cantDias += 30-dia;
				 else cantDias += 31-dia;}
		}else {if (mes % 2 == 0) cantDias += 31-dia;
				else cantDias += 30-dia;}
		
		
		
		switch (mes) {			
		case 1: cantDias +=28 ;		
		case 2: cantDias +=31 ;		 
		case 3: cantDias +=30 ;			
		case 4: cantDias +=31 ;	
		case 5: cantDias +=30 ;	
		case 6: cantDias +=31 ;
		case 7: cantDias +=31 ;	
		case 8: cantDias +=30 ;
		case 9: cantDias +=31 ;			
		case 10: cantDias +=30 ;
		case 11: cantDias +=31;		
		}
		
		System.out.print("Quedan " + cantDias + " para que se acabe el año");
		
	}
	
}
