package com.cursojava.introduccion.teoria.enumerados;

public class TestMes {
	public static void main(String[] args) {
		Mes actual = Mes.ENERO;
		
		System.out.println("Estamos en el mes " + actual + ", su abreviatura es '" + actual.getAbrev() +
				"' y tiene " + actual.getDias() + " dias.");
	}
}
