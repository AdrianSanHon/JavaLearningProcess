package com.cursojava.introduccion.teoria.metodos;

public class Metodos02 {

	//Sobrecarga de operadores. Los llamas igual y dependiendo de lo que le metas se ejecuta uno u otro
	//La sobrecarga de metodos tiene en cuenta la firma.
	//Nunca se puede repertir la misma firma.
	//¡¡¡¡¡¡¡¡¡¡¡ OJO porque el tipoDevuelto no entra en la firma !!!!!!!!!!!!!!!!!
	
	public static int suma (int n1, int n2) { //firma -> suma(int,int)
		return n1 + n2;
	}
	
	public static double suma(double n1, double n2) {
		return n1+n2;
	}
	public static int suma (int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	public static double suma(double n1, double n2, double n3) {
		return n1+n3+n2;
	}
	
}
