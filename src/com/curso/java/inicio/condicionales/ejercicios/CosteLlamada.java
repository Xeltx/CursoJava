package com.curso.java.inicio.condicionales.ejercicios;

public class CosteLlamada {

	public static void main(String[] args) {

		int llamada = 0;
		String diaSemana;
		int hora;
		int duracionLlamada = 9;

		if (llamada < 5) {
			llamada += duracionLlamada + 1;
		} else if (llamada > 8) {
			llamada += duracionLlamada + 1 + 0.80;
		} else if (llamada >= 10) {

		}
		System.out.println(llamada);
	}
}
