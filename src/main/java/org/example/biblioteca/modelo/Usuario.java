package org.example.biblioteca.modelo;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String email;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}