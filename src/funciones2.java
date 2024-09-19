
public class funciones2 {
	public static void main(String[] args) {
		// Funcion que recibe un numero y un texto y me va a pintar el texto que le
		// pasemos el numéro de veces indicado por el parámetro numérico.
		fundicion("creciente", 10);
		//System.out.println(funciones4.funcionOperacion(2, 4,"suma"));
	}

	private static void fundicion(String palabra, int numero) {

		for (int i = 0; i < numero; i++) {
			System.out.println(palabra);
		}
	}
}
