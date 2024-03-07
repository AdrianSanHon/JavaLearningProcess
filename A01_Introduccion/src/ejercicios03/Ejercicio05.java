package ejercicios03;

import java.util.Scanner;

/* Escribir un programa que pida al usuario un número, que representará una cantidad de 
 * dinero expresada en euros. A continuación, el programa le ofrecerá un menú al usuario en 
 * el que le preguntará a qué divisa quiere convertir del dinero e imprimirá la conversión. Las 
 * posibles divisas son las siguientes (se indica el tipo de cambio)
 */
public class Ejercicio05 {
	public static void main(String[] args) {
		System.out.println("Ingrese cantidad de dinero a cambiar (euros)");
		Scanner teclado = new Scanner(System.in);
		double eur = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Estas son las divisas que tenemos disponibles: \n"
				+ "\t- Dólares (1 dólar = 0,88 euros) (Codigo: Dol)\n"
				+ "\t- Libra Esterlina (1 Libra = 1,20 euros) (Codigo: LbE)\n"
				+ "\t- Yen (1 yen = 0,0077 euros) (Codigo: Y)\n"
				+ "\t- Dólares Canadienses (1 dólar = 0,71 euros) (Codigo: Can)\n"
				+ "Ingrese el simbolo de la divisa a cambiar:");
		String sym = teclado.nextLine();
		double div = 1;
		switch (sym) {
			case "Dol":
				div = 0.88;
				sym = "$";
				break;
			case "LbE":
				div = 1.2;
				sym = "£";
				break;
			case "Y":
				div = 0.0077;
				sym = "¥";
				break;
			case "Can":
				div = 0.71;
				sym = "$";
				break;
		}
		System.out.println("De acuerdo, le correspoden un total de " + (div*eur) + " "+sym);
	}
	
	
}
