package com.app.web.model;

public class Grupo {

	private long idGrupo;
	private String nombre;
	private String folio;

	public Grupo() {
		super();
	}

	public Grupo(String nombre, String folio) {
		super();
		this.nombre = nombre;
		this.folio = folio;
	}

	public Grupo(long idGrupo, String nombre, String folio) {
		super();
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.folio = folio;
	}

	public long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(long idGrupo) {
		this.idGrupo = idGrupo;
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
