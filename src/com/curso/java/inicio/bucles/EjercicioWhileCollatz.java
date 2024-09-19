package com.curso.java.inicio.bucles;

import java.util.Scanner;

public class EjercicioWhileCollatz {
	public static void main(String[] args) {
		System.out.println("Escribe un numero");
		Scanner Scan = new Scanner(System.in);
		int respuesta = Scan.nextInt();
		System.out.println(respuesta);
		while (respuesta != 1) {
		
			if (respuesta % 2 == 0) {
				respuesta /= 2;
			} else {
				respuesta =respuesta * 3 + 1;
				
	
			}
			System.out.println(respuesta);
		}
		

	}
}
