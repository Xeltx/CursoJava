package com.curso.java.ficheros;

public class EjerciciosFicheroQuijote {
public static void main(String[]args) {
	String quijote = "    En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda...           ";
	System.out.println("El tamaño del texto sin espacios los espacion del principio y el final es: ");
	System.out.println(quijote.trim().length()); 
	System.out.println();
	System.out.println("La segunda frase es:");
	System.out.println(quijote.substring(quijote.indexOf(".")));
    System.out.println();
    System.out.println("En el texto parece la palabra Quijote");
    System.out.println(quijote.contains("Quijote"));
    System.out.println();
    System.out.println("¿Cuantas comas tiene el texto del Quijote?");
    System.out.println();
    	
    
    
  }
}
