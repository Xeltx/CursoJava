package EXAMENES;

import java.util.Scanner;

public class ExamenPractico1_1 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String Palabra = Scan.nextLine();

		System.out.println("la palabra tiene: " + Palabra.replace(" ", "").length() + " letras.");

	}
}
