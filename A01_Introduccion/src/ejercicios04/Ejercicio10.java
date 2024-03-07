package ejercicios04;

import java.util.Scanner;

/*Solicite al usuario un número que represente el mes e imprima su nombre y la cantidad de 
días que tiene (no contemplar años bisiestos)*/
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digame un numero del 1 al 12");
		int nmonth = teclado.nextInt();
		int dias = 0;
		if (nmonth%2==0) {
			if(nmonth>=8) dias = 31;
			else dias = 30;
		} else {
			if(nmonth>=8) dias = 30;
			else dias = 31;
		}
		
		System.out.println(dias);
	}
	
}
