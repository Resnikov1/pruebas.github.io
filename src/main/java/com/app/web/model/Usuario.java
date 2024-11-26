package com.app.web.model;

public class Usuario {

	private long idUsuario;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correo;
	private String password;
	private String numeroEmpleado;
	private String superUsuario;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String password,
			String numeroEmpleado, String superUsuario) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.correo = correo;
		this.password = password;
		this.numeroEmpleado = numeroEmpleado;
		this.superUsuario = superUsuario;
	}

	public Usuario(long idUsuario, String nombre, String apellidoPaterno, String apellidoMaterno, String correo,
			String password, String numeroEmpleado, String superUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.correo = correo;
		this.password = password;
		this.numeroEmpleado = numeroEmpleado;
		this.superUsuario = superUsuario;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getSuperUsuario() {
		return superUsuario;
	}

	public void setSuperUsuario(String superUsuario) {
		this.superUsuario = superUsuario;
	}

}
