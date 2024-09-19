package com.curso.java.poo;

public class Vestido {
	private String color;
	private double talla;
	private double precio;

	public Vestido() {

	}

	public Vestido(String color, double talla, double precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
