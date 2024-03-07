package ejercicios02;

import java.util.Scanner;

/*
 * Solicitando al usuario la cantidad de números a procesar, emitir el siguiente informe:
 * Cantidad de nos. Ingresados: xx
 * Sumatoria: xxx
 * Cantidad de nros positivos o 0: xx
 * Cantidad de nros negativos: xx
 * Cantidad de nros pares: xx
 * Cantidad de nros impares: xx
 * Mayor valor: xxx – ingresado en el lugar: xx
 * Menor valor: xxx – ingresado en el lugar: xx
 * Media: xx
 * */

public class Ejercicio09 {

	public static void ejecute() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame numeros:");
		int num = teclado.nextInt();
		teclado.nextLine();
		
		String respuesta = "";
		int num_totales = 0;
		int suma = 0;
		int pos = 0;
		int neg = 0;
		int par = 0;
		int impar = 0;
		int mayor = num; int lugar_mayor = 1;
		int menor = num; int lugar_menor = 1;
		
		num_totales += 1;
		suma += num;
		if (num>0) pos += 1; else neg +=1;
		if (num%2 == 0) par +=1; else impar +=1;
		
		System.out.println("Quieres seguir dandome numeros ?");
		respuesta = teclado.nextLine();
		
		
		while (respuesta.equals("s")){
			System.out.println("Dameloh");
			num = teclado.nextInt();
			teclado.nextLine();
			num_totales += 1;
			suma += num;
			if (num>=0) pos += 1; else neg +=1;
			if (num%2 == 0) par +=1; else impar +=1;
			if (num>mayor) {mayor = num; lugar_mayor = num_totales;} 
				else if (num<menor) {menor = num;lugar_menor = num_totales;
				}
			System.out.println("Quieres seguir dandome numeros ?");
			respuesta = teclado.nextLine();
		};
		
		double media = suma / num_totales;
		
		System.out.println("Cantidad de nos. Ingresados:" +num_totales + "\n"
				+ "Sumatoria:" + suma + " \n"
				+ "Cantidad de nros positivos o 0: " + pos + "\n"
				+ "Cantidad de nros negativos: " + neg + "\n"
				+ "Cantidad de nros pares: " + par + "\n"
				+ "Cantidad de nros impares: " + impar + "\n"
				+ "Mayor valor: " + mayor + " – ingresado en el lugar: " + lugar_mayor + "\n"
				+ "Menor valor: " + menor + " – ingresado en el lugar: " + lugar_menor + "\n"
				+ "Media: " + media + ".");
	}
	public static void main(String[] args) {
		ejecute();
	}
}
