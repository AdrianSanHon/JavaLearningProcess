package ejercicios04;

import java.util.Scanner;

//Solicite al usuario un número que represente el mes e imprima su nombre.
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digame un numero del 1 al 12");
		int nmonth = teclado.nextInt();
		String month = "";
		switch (nmonth) {
		case 1:
			month = "Enero";
			break;
		case 2:
			month = "Feb";
			break;
		case 3:
			month = "Mar";
			break;
		case 4:
			month = "Abril";
			break;
		case 5:
			month = "Mayo";
			break;
		case 6:
			month = "Junio";
			break;
		case 7:
			month = "Julio";
			break;
		case 8:
			month = "Agosto";
			break;
		case 9:
			month = "Sep";
			break;
		case 10:
			month = "Oct";
			break;
		case 11:
			month = "Nov";
			break;
		case 12:
			month = "Dic";
			break;
		}
		System.out.println("El mes numero " + nmonth + " es " + month + ".");
	}
	
}
