package com.app.web.model;

public class MedidoresConsulta {

	private long id_medidor;
	private String tipoServicio;
	private String numeroSerie;
	private String codigoLote;
	private String codigoMedidor;
	private String marca;
	private String modelo;
	private long idRuta;
	private long idGrupo;
	private String latitud;
	private String longitud;
	private String idRadio;

	public MedidoresConsulta() {
		super();
	}

	public MedidoresConsulta(String tipoServicio, String numeroSerie, String codigoLote, String codigoMedidor,
			String marca, String modelo, long idRuta, long idGrupo, String latitud, String longitud, String idRadio) {
		super();
		this.tipoServicio = tipoServicio;
		this.numeroSerie = numeroSerie;
		this.codigoLote = codigoLote;
		this.codigoMedidor = codigoMedidor;
		this.marca = marca;
		this.modelo = modelo;
		this.idRuta = idRuta;
		this.idGrupo = idGrupo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.idRadio = idRadio;
	}

	public MedidoresConsulta(long id_medidor, String tipoServicio, String numeroSerie, String codigoLote,
			String codigoMedidor, String marca, String modelo, long idRuta, long idGrupo, String latitud,
			String longitud, String idRadio) {
		super();
		this.id_medidor = id_medidor;
		this.tipoServicio = tipoServicio;
		this.numeroSerie = numeroSerie;
		this.codigoLote = codigoLote;
		this.codigoMedidor = codigoMedidor;
		this.marca = marca;
		this.modelo = modelo;
		this.idRuta = idRuta;
		this.idGrupo = idGrupo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.idRadio = idRadio;
	}

	public long getId_medidor() {
		return id_medidor;
	}

	public void setId_medidor(long id_medidor) {
		this.id_medidor = id_medidor;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getCodigoLote() {
		return codigoLote;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}

	public String getCodigoMedidor() {
		return codigoMedidor;
	}

	public void setCodigoMedidor(String codigoMedidor) {
		this.codigoMedidor = codigoMedidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public long getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(long idRuta) {
		this.idRuta = idRuta;
	}

	public long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getIdRadio() {
		return idRadio;
	}

	public void setIdRadio(String idRadio) {
		this.idRadio = idRadio;
	}

}
