package com.app.web.model;

public class Ruta {

	private long idRuta;
	private String nombre;
	private String folio;

	public Ruta() {
		super();
	}

	public Ruta(String nombre, String folio) {
		super();
		this.nombre = nombre;
		this.folio = folio;
	}

	public Ruta(long idRuta, String nombre, String folio) {
		super();
		this.idRuta = idRuta;
		this.nombre = nombre;
		this.folio = folio;
	}

	public long getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(long idRuta) {
		this.idRuta = idRuta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

}
