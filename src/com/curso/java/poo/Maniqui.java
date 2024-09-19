package com.curso.java.poo;

public class Maniqui {
	private String id;
	private Vestido vestido1;
	private Pantalon pantalon1;
	private Camisa camisa1;

	public Maniqui() {

	}

	public Maniqui(String id, Vestido vestido1, Pantalon pantalon1, Camisa camisa1) {
		super();
		this.id = id;
		this.vestido1 = vestido1;
		this.pantalon1 = pantalon1;
		this.camisa1 = camisa1;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Vestido getVestido1() {
		return vestido1;
	}

	public void setVestido1(Vestido vestido1) {
		this.vestido1 = vestido1;
	}

	public Pantalon getPantalon1() {
		return pantalon1;
	}

	public void setPantalon1(Pantalon pantalon1) {
		this.pantalon1 = pantalon1;
	}

	public Camisa getCamisa1() {
		return camisa1;
	}

	public void setCamisa1(Camisa camisa1) {
		this.camisa1 = camisa1;
	}

}