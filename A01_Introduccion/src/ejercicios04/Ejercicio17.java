package ejercicios04;

import java.util.Scanner;

//Realizar el juego “Adivina número”. El ordenador debe generar un número “secreto” 
/*
 * 4 cifras
 * No comenzar en 0
 * 
 */
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pos = 0;
		int god = 0;
		int snum1,snum2,snum3,snum4,gnum1,gnum2,gnum3,gnum4;
		snum1 = (int) Math.floor(Math.random()*9+1);
		snum2 = (int) Math.floor(Math.random()*9);
		snum3 = (int) Math.floor(Math.random()*9);
		snum4 = (int) Math.floor(Math.random()*9);
		int sol = snum1*1000+snum2*100+snum3*10+snum4;
		
		
		System.out.println("Este es el numero que tienes que averiguar: " + sol);
		
		System.out.println("Guess the number:");
		int guess = teclado.nextInt();
		teclado.nextLine();
		
		gnum1 = (int) Math.floor(guess / 1000);
		gnum2 = (int) Math.floor((guess%1000) / 100);
		gnum3 = (int) Math.floor(((guess%1000)%100) / 10);
		gnum4 = (int) (((guess%1000)%100) % 10);
		
		System.out.println(gnum1 + "" + gnum2 + "" + gnum3 + "" + gnum4);
		
		
			
		do {
			
			god = pos = 0;
			
			gnum1 = (int) Math.floor(guess / 1000);
			gnum2 = (int) Math.floor((guess%1000) / 100);
			gnum3 = (int) Math.floor(((guess%1000)%100) / 10);
			gnum4 = (int) (((guess%1000)%100) % 10);
			
			if (gnum1 == snum1) {god ++; pos++;}
				else if (gnum1 == snum2 || gnum1 == snum3 || gnum1 == snum4) pos++;
	
			if (gnum2 == snum2) {god ++; pos++;} 
				else if (gnum2 == snum1 || gnum2 == snum3 || gnum2 == snum4) pos++;
	
			if (gnum3 == snum3) {god ++; pos++;} 
				else if (gnum3 == snum2 || gnum3 == snum1 || gnum3 == snum4) pos++;
	
			if (gnum4 == snum4) {god ++; pos++;}
				else if (gnum4 == snum2 || gnum4 == snum3 || gnum4 == snum1) pos++;
			if (god < 4) {
				System.out.println("Este es tu score ------>  "+ pos + " : " + god);
				guess = teclado.nextInt();
				teclado.nextLine();
			}
		}while(god < 4);
		
		System.out.println();
		
		
		
	}
}
