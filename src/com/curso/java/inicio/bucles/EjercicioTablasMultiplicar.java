package com.curso.java.inicio.bucles;

public class EjercicioTablasMultiplicar {
	public static void main(String[] args) {

		int Num_dos = 0;
		int resultado = 0;
		for (int Numero1 = 0; Numero1 <= 10; Numero1 += 1) {
			System.out.println(Num_dos + "x" + Numero1 + "=" + (resultado = Num_dos * Numero1));
			
			while (Numero1 == 10) {
				Numero1 =0;
				Num_dos++;

				while (Num_dos > 10) {
					continue;
				}
			}

			

		}
	}
}
