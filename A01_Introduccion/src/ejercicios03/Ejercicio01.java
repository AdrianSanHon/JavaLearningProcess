package ejercicios03;

import java.util.Scanner;

/*
 * 
 * Dados un número indefinido de notas obtenidas por alumnos en sus exámenes, mostrar 
 * por pantalla la mayor y la menor nota obtenida del grupo. (Cuando el usuario ingrese -1 
 * finaliza la carga)
 * 
 * */
public class Ejercicio01 {
	public static void main(String[] args) {
		double mayor, menor, media, nota, total, suma;
		System.out.println("Ingrese notas de sus alumnos. Ingrese <-1> para terminar.");
		Scanner teclado = new Scanner(System.in);
		nota = teclado.nextDouble();
		teclado.nextLine();
		total = 1;
		suma = nota;
		mayor = nota;
		menor = nota;
		nota=teclado.nextDouble();
		teclado.nextLine();
		while (nota > -1) {
			total += 1;
			suma += nota;
			mayor = nota>mayor?nota:mayor;
			menor = nota<menor?nota:menor;
			nota=teclado.nextDouble();
			teclado.nextLine();
		}
		media = Math.round(suma/total);
		System.out.println("La mayor nota ha sido: " + mayor + "\n" +
						   "La menor nota ha sido: "+ menor + "\n" + 
						   "La media ha sido: "+ media + "\n");
		
	}
}
