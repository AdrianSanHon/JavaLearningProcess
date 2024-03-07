package recursividad;

import java.security.DomainCombiner;

public class recursividad {
	//Factorial de un numero
	public static int factorial(int n) {
		if (n == 0) return 1;
		else {
			return n*factorial(n-1);
		}
	}
	
	//suma de los primeros n numeros naturales
	public static int sumaNumerosNaturales(int n) {
		if (n == 0) return 0;
		else {
			return n+sumaNumerosNaturales(n-1);
		}
	}
	//cantidad de digitos de un numero natural dado
	public static int cantidadDigitosNatural(int n) {
		if (n / 10 == 0) return 1;
		else return 1 + cantidadDigitosNatural(n/10);
	}

	//numero de orden n de la serie de fibonacci
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1){
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	//potenciacion
	public static int potencia(int a, int b) {
		if (b == 1)
			return a;
		else return a*potencia(a,b-1);
	}
	
	//transformacion decimal -> binario
	public static String bin(long n) {
		
		if (n/2 == 0) return "" + n%2;
		else return "" + bin(n/2) + (n%2);
		
	}
	//transformacion decimal -> hexadecimal
		public static String valueHexa(int n) {
			switch(n) {
			case 0,1,2,3,4,5,6,7,8,9:
				return ""+n;
			case 10,11,12,13,14,15:
				return "" + (char)('A' + (n-10));
			default: return "";
			}
		}
		public static String decAHexa(int n) {
			
			if (n<16) return valueHexa(n);
			else return decAHexa(n/16) + valueHexa(n%16);
			
		}
	
	
	
	public static void main(String[] args) {
		System.out.println("Factorial de 5: " + factorial(5) );
		System.out.println("Suma de los primeros 5 numeros naturales: " + sumaNumerosNaturales(5) );
		System.out.println("Cantidad de digitos del 31542: " + cantidadDigitosNatural(31542) );
		System.out.println("Serie de Fibonacci F(5): " + fibonacci(5) );
		System.out.println("Potenciacion, 5 elevado a 3 " + potencia(5,3) );
		System.out.println("A binario 123456: " + bin(123456));
		System.out.println("A hexadecimal: " + decAHexa(879456));
	}
}
