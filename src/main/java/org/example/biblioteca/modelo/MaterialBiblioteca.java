package org.example.biblioteca.modelo;

public abstract class MaterialBiblioteca {

	protected int id;
	protected boolean prestado;
	protected String titulo;
	protected String autor;

	public boolean isPrestado() {
		return this.prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}