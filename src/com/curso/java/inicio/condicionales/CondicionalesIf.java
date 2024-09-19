package com.curso.java.inicio.condicionales;

public class CondicionalesIf {

	public static void main(String[] args) {
		int numero = 6;
		System.out.println("EMPIEZA");
		if (!(numero > 10)) {
			System.out.println("EL NÚMERO ES MAYOR DE 10");
		} else if (numero >=0 && numero < 5) {
			System.out.println("EL NÚMERO ESTÁ ENTRE 0 Y 5");
		} else if (numero>=5) {
			System.out.println("EL NÚMERO ESTÁ ENTRE 5 Y 10");
		} else {

			System.out.println("EL NÚMERO ES MENOR DE 0");
		}
		if(numero != 10) {
			System.out.println("El número no es 10");
		}
		System.out.println(!true);
	}

}
