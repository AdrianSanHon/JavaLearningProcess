package com.cursojava.introduccion.teoria.enumerados;

public class TestDia {
	public static void main(String[] args) {
		Dia hoy = Dia.MARTES;
		
		System.out.println(hoy);
		
		System.out.println(hoy.ordinal());
		
		Dia[] dias = Dia.values();
		for (Dia dia : dias) {
			System.out.println(dia);
		}
	}
}
