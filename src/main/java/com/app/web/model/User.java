package com.app.web.model;

public class User {

	private Long idUser;
	private String email;
	private String password;

	public User() {
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public User(Long id, String email, String password) {
		super();
		this.idUser = id;
		this.email = email;
		this.password = password;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [id=" + idUser + ", email=" + email + ", password=" + password + "]";
	}

}
