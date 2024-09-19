package com.curso.java.inicio.condicionales.ejercicios;

public class EjercicioIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asignatura = "Lengua";
		String nombreAlumno = "Charlie";
		int nota = 5;
		String notaStr = "";
		if (nota >= 0 && nota < 5) {
			notaStr = "suspenso";
		} else if (nota >= 5 && nota < 7) {
			notaStr = "aprobado";
		} else if (nota >= 7 && nota < 9) {
			notaStr = "notable";
		} else if (nota >= 9 && nota <= 10) {
			notaStr = "sobresaliente";
		}else {
			System.out.println("La nota "+ nota + " no es correcta");
		}
		System.out.println("El alumno " + nombreAlumno + " en la asignatura " + asignatura + " tiene un " + notaStr);
	}

}
