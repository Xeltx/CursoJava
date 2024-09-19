package com.curso.java.poo;

public class Persona {
	String nombre;//6 bits
	String apellido;//30 bits
	String dni;//32 bits
	int edad;//20 bits

	public void Correr() {
		System.out.println("la persona " + nombre + " esta corriendo");
	}

	public void Comer() {
		System.out.println("la persona " + nombre + " esta comiendo");
	}

}
