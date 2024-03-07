package ejercicios02;

public class Ejercicio13 {

	public static void ejecute() {
		
		// fichitas de domino sin repetir, roio 2:1 es igual que 1:2
		String sol = "";
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				sol = sol + i + " : " + j + "\n";
			}
		}
		System.out.println(sol);
		
	}
	public static void main(String[] args) {
		ejecute();
	}
	
}
