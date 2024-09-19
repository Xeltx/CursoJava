package com.curso.java.poo;

public class Camisa {
	private String color;
	private double talla;
	private double precio;
	private Boton[] botones;

	public Camisa() {

	}

	public Camisa(String color, double talla, double precio, Boton[] botones) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
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

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

}
