
public class EjercicioMatrices {
	public static void main(String[] args) {
		// + Definir array bidimensional de enteros de 2x3
		// + Dar los valores de cada posición de una en una
		// + Mostrar todos los datos en formato matriz con dos for anidados
		// + Hacer los mismo con 2 foreach

		int[][] columna = new int[2][2];

		columna[0][0] = 2;
		columna[0][1] = 4;
		// columna[0][2] = 3;
		columna[1][0] = 6;
		columna[1][1] = 5;
		// columna[1][2] = 7;

		for (int Pnum = 0; Pnum <columna.length ; Pnum++) {

				
				for (int Enum = 0; Enum <columna[Pnum].length; Enum++) {

					System.out.print(columna[Pnum][Enum]);
				}
System.out.println();

		}

	}
}
