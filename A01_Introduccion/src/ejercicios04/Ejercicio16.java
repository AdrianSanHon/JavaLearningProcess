package ejercicios04;

import java.util.Scanner;

/*
 * Escriba un programa que nos calcule el cambio que debe dar la caja de un supermercado: 
 * Dado un precio y una cantidad de dinero, el programa nos dirá cuántas monedas deben 
 * darse como cambio de tal forma que el número total de monedas sea mínimo
 * */

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca ticket:");
		double tick = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Introduzca dineros:");
		double mon = teclado.nextDouble();
		teclado.nextLine();
		
		while (mon<tick) {
			System.out.println("Con eso no te llega. Dame mas dineros:");
			mon = teclado.nextDouble();
			teclado.nextLine();
		}
		
		double diff = mon-tick;
		int b50 = (int) Math.floor(diff/50);
		diff -= b50*50; 
		int b20 = (int) Math.floor(diff/20);
		diff -= b20*20; 
		int b10 = (int) Math.floor(diff/10);
		diff -= b10*10; 
		int b5 = (int) Math.floor(diff/5);
		diff -= b5*5;
		
		int m2 = (int) Math.floor(diff/2);
		diff -= m2*2;
		int m1 = (int) Math.floor(diff/1);
		diff -= m1;		
		int m50 = (int) Math.floor(diff/0.5);
		diff -= m50*(0.5);
		int m20 = (int) Math.floor(diff/0.2);
		diff -= m20*(0.2);
		int m10 = (int) Math.floor(diff/0.1);
		diff -= m10*(0.1);
		int m05 = (int) Math.floor(diff/0.05);
		diff -= m05*(0.05);
		int m02 = (int) Math.floor(diff/0.02);
		diff -= m02*(0.02);
		int m01 = (int) Math.floor(diff/0.01);
		diff -= m01*(0.01);
		
		System.out.println("Aquí tienes las vueltas: ");
	}
}
