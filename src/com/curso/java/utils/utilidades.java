package com.curso.java.utils;

import java.util.Scanner;

public class utilidades {
	public static void main(String[] args) {
		// utilidad0("Cual es tu edad?");
		utilidad1("me gusta el helado");
	}
	public static int utilidad0(String pregunta) {
		/**
		 * @funcion:pide una pregunta y devuelve un numero.
		 */
		int dato = 0;
		System.out.println(pregunta);
		Scanner Scan = new Scanner(System.in);
		dato = Scan.nextInt();

		return dato;
	}

	public static String utilidad1(String DatoST) {
		/**
		 *@funcion:pide una pregunta y devuelve una pregunta.
		 */
		String pregunta = "";
		System.out.println(DatoST);
		Scanner Scan = new Scanner(System.in);
		pregunta = Scan.nextLine();
		return pregunta;
	
	
	}

}
