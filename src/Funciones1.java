import java.util.Scanner;

public class Funciones1 {
	public static void main(String[] args) {
		// definir funcion que recibe un String y devuelve la longitud del String.
		Scanner Scan = new Scanner(System.in);
		String Palabra = Scan.nextLine();

		System.out.println(Funciones0(Palabra));

	}

	public static int Funciones0(String texto) {

		int longitud = texto.replace(" ", "").length();

		return longitud;
	}
}
