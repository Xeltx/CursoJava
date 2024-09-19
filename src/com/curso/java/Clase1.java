package com.curso.java;

public class Clase1 {

	public static void main(String[] args) {
		String nombre="Elvis";
		int Edad=480;
		String EdadStr = "";
		if ( Edad >= 11 && Edad< 18 ) {
		 EdadStr = "Adolescente";
	   }else if (Edad >=18 && Edad<30) {
		   EdadStr = "adulto joven";
	   }else if (Edad >=30 && Edad< 60) {
		   EdadStr = "Adulto";
	   }else if (Edad >= 60 && Edad<= 120) {
		   EdadStr = "Anciano";
	   }else if (Edad>=121)
		EdadStr="Sanstastico guesudo";
		System.out.println(nombre + " tiene " + Edad + " años, es un " + EdadStr + "." );
		
	}

}
