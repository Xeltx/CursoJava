
public class funciones3 {
	public static void main(String[] args) {
//Funcion a la que le paso un numero y me pinta la tabla de multiplicar de ese numero.
		tablam(9);
	}

	private static void tablam(int numero) {
		int i = 0;
		for (i = 0; i < 11; i++) {
			System.out.println(numero + "x" + i + "=" + numero*i);
			
		}
		
	}
}
