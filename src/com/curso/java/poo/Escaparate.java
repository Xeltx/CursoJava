package com.curso.java.poo;

import java.util.Scanner;

public class Escaparate {
	public static void main(String[] args) {
		Boton boton00 = new Boton("estrella", "azul", "pequeño");
		Boton boton01 = new Boton("circulo", "rojo", "mediano");
		Boton boton02 = new Boton("triangulo", "purpura", "grande");
		Boton[] botones00 = { boton00, boton01, boton02 };
		Boton boton03 = new Boton("circulo", "negro", "grande");
		Pantalon pantalon00 = new Pantalon("negro", 1.10, 4.20, boton03);
		Camisa camisa00 = new Camisa("amarillo", 1.11, 4.50, botones00);
		Vestido vestido00 = new Vestido("Blanco", 1.02, 6.6);

		Boton boton04 = new Boton("pentagono", "verde", "pequeño");
		Boton boton05 = new Boton("cuadrado", "blanco", "grande");
		Boton boton06 = new Boton("circulo", "carmesi", "mediano");
		Boton[] botones01 = { boton04, boton05, boton06 };
		Boton boton07 = new Boton("cuadrado", "gris", "grande");
		Pantalon pantalon01 = new Pantalon("blanco", 1.18, 6.20, boton07);
		Camisa camisa01 = new Camisa("negro", 1.16, 4.20, botones01);
		Vestido vestido01 = new Vestido("morado", 1.0, 3.4);

//==================================================================================================================================
		Maniqui maniqui00 = new Maniqui("A16", null, pantalon00, camisa00);
		Maniqui maniqui01 = new Maniqui("B21", vestido01, null, null);
		Maniqui[] escaparate00 = { maniqui00, maniqui01 };

	}
	public static void RecManiquies(Maniqui[] arrayMA) {
		for(Maniqui i :arrayMA ) {
			System.out.println(i);
		}
	}
}
