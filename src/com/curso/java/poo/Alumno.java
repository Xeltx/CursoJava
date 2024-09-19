package com.curso.java.poo;

public class Alumno {
	private String nombre;
	private String apellidos;
	private boolean mayorEdad;
	private String dni;
	private int nota;

	public Alumno() {

	}

	public Alumno(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.dni = dni;

	}

	public Alumno(String nombre, String apellido, String dni, int nota) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.dni = dni;
		this.nota = nota;
	}

	public Alumno(String nombre, String apellidos, boolean mayorEdad, String dni, int nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mayorEdad = mayorEdad;
		this.dni = dni;
		this.nota = nota;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellidos;
	}

	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}

	public boolean isMayorEdad() {
		return this.mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
