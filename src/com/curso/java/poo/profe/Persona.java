package com.curso.java.poo.profe;



//POJO
public class Persona {
	//Variables de instancia o atributos
	 String nombre;//6 bits
	 String apellidos;//30bits
	 int edad;//32 bits
	 String dni;//20 bits
	
	//Constructores
	public Persona() {
		
	}
	
	public Persona (String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public Persona (String nombre, String apellidos, String dni) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni= dni;
	}
	
	public Persona (String nombre, String apellidos, 
			String dni, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni= dni;
		this.edad=edad;
	}
	
	//Metodos get y set (getter y setter)
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	//Métodos
	public void correr() {
		System.out.println("La persona "+ nombre + " está corriendo");
		if (edad<20) {
			System.out.println("Muy rápido");
		}else if(edad<40) {
			System.out.println("Rápido");
		}else {
			System.out.println("Lento");
		}
	}
	
	public void comer() {
		System.out.println("La persona "+ nombre + " está comiendo");
	}
	
}
