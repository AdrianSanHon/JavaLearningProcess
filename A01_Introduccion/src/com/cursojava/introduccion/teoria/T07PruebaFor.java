package com.cursojava.introduccion.teoria;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class T07PruebaFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 10 ; i++){			
			System.out.println(i);
			}
		// System.out.println(i); <- "i" no existe fuera del for (Alcance de la varaible limitado al bucle)
	
		for (int j = 1, k =100 ; j<=10 && k >=0 ; j++, k-=10) {
			System.out.println(j+"\t"+k);
		}	
	}
}

