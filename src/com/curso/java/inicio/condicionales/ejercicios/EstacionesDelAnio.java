package com.curso.java.inicio.condicionales.ejercicios;

public class EstacionesDelAnio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreMes = "Mayo";

		if (nombreMes == "Enero" || nombreMes == "Febrero" || nombreMes == "Marzo") {
			System.out.println("Invierno");
		} else if (nombreMes == "Abril" || nombreMes == "Mayo" || nombreMes == "Junio") {
			System.out.println("Primavera");
		} else if (nombreMes == "Julio" || nombreMes == "Agosto" || nombreMes == "Septiembre") {
			System.out.println("Verano");
		} else if (nombreMes == "Octubre" || nombreMes == "Noviembre" || nombreMes == "Diciembre") {
			System.out.println("Otoño");
		}

	}

}
