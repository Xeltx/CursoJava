package com.curso.java.poo.profe;


import com.curso.java.utils.utilidades;

public class Cine {

	public static void main(String[] args) {
		Persona persona0 = new Persona();
		
		Persona persona1 = new Persona("Eva","García","1A",28);
//		persona1.edad=28;
//		persona1.nombre="Eva";
//		persona1.apellidos="García";
//		System.out.println(persona1.edad);
		System.out.println(persona1.getNombre());
		persona1.apellidos = persona1.apellidos.toUpperCase();
		System.out.println(persona1.apellidos);
		persona1.correr();
		
		String nombre = utilidades.utilidad1("Introduce tu nombre");
		String apellidos = utilidades.utilidad1("Introduce tu apellido");
		Persona persona2 = new Persona(nombre, apellidos, "2B");
		persona2.edad=41;
		//persona2.nombre="Luz";
		persona2.correr();
		
		Persona persona3 = new Persona("Elvis","Apellido3");
		persona3.edad=18;
		persona3.dni="Apellidos3";
		//persona3.nombre="Elvis";
		persona3.correr();
		System.out.println(persona3.apellidos.toUpperCase());
		
		Persona persona4 = persona3;
		persona4.setNombre("Carlos"); 
		System.out.println(persona3.getNombre());
		
		
		Factura factura1 = new Factura("Ref1","20240913",1000);
		
	}

}
