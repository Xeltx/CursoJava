
public class funciones4 {
	public static void main(String[] args) {
		// System.out.println(funcionSumaValores(7, 7));
		// System.out.println(funcionOperacion(7, 3, "suma"));
		// System.out.println(funcionOperacion(8, 3, "resta"));
		// System.out.println(funcionOperacion(10, 5, "division"));
		// System.out.println(funcionOperacion(7, 3, "multiplicacion"));
		int[] arrayPrueba = { 1, 3, 5, 6, 8, 14 };
		// System.out.println(funcionOperacionSumaArray(arrayPrueba));
		System.out.println(funcionMediaArray(arrayPrueba));
	}

	public static int funcionSumaValores(int numero0, int numero1) {
		System.out.print(numero0 + "+" + numero1 + "=");
		return numero0 + numero1;
	}

	public static int funcionOperacion(int valor0, int valor1, String operacion) {
		/**
		 * @funcion:realizar una operacion entre 4(suma,resta,division y multiplicacion).
		 * @estructura:[numero,numero,operacion indicada(escribalo en palabras).
		 * @ejemplo:[4,3,suma]
		 */

		int resultado = 0;
		if (operacion.equals("suma")) {
			System.out.print(valor0 + "+" + valor1 + "=");
			resultado = valor0 + valor1;
		}
		if (operacion.equals("resta")) {
			System.out.print(valor0 + "-" + valor1 + "=");
			resultado = valor0 - valor1;
		}
		if (operacion.equals("division")) {
			System.out.print(valor0 + "%" + valor1 + "=");
			resultado = valor0 / valor1;
		}
		if (operacion.equals("multiplicacion")) {
			System.out.print(valor0 + "x" + valor1 + "=");
			resultado = valor0 * valor1;
		}

		return resultado;
	}

	public static int funcionOperacionSumaArray(int[] sumarArray) {
		int i = 0;
		int resultado = 0;
		for (i = 0; i < sumarArray.length; i++) {
			resultado += sumarArray[i];
		}
		return resultado;
	}

	public static int funcionMediaArray(int[] arrayRE) {
		int resultado = 0;
		int suma = funcionOperacionSumaArray(arrayRE);
		resultado = suma / arrayRE.length;
		return resultado;
	}
	
}
