package ejercicios02;
//Escribir un programa que imprima las tablas del 1 al 9.
public class Ejercicio11 {

	public static void ejecute() {
		
		System.out.println("Las tablas de multiplicar.");
		String sol = "";
		int prod = 1;
		for (int j = 1 ; j<=9; j++) {
			System.out.println("Tabla del " + j +": ");
			for (int i = 1; i<=9 ; i++) {
			prod = j * i;
			sol = sol + "\t" + j + " * " + i + " = " + prod + "\n";
			}
			System.out.println(sol);
			sol ="";			
		}		
	}
	public static void main(String[] args) {
		ejecute();
	}
}
