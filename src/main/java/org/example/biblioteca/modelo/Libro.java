package org.example.biblioteca.modelo;

public class Libro extends MaterialBiblioteca implements Prestable {

	private String titulo;
	private String autor;
	private boolean prestado;
	private String ISBN;
	private String edicion;

	public Libro(String titulo, String autor, String isbn, String edicion){
		this.titulo=titulo;
		this.autor=autor;
		this.prestado=false;
		this.ISBN=isbn;
		this.edicion=edicion;
	}
	public Libro(String titulo, String autor, String isbn, String edicion,boolean prestado){
		this.titulo=titulo;
		this.autor=autor;
		this.prestado=prestado;
		this.ISBN=isbn;
		this.edicion=edicion;

	}

	public String getEdicion() {
		return this.edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIsbn(){
		return ISBN;
	}

	public void prestar(){
		prestado=true;

	}
	public  void devolver(){
		prestado=false;
	}
	@Override
	public String toString(){
		return titulo+","+autor+","+ISBN+","+edicion+","+prestado;
	}


	public String toStringMostrar(){
		return "Título: "+titulo+"\nAutor: "+autor+"\nISBN: "+ISBN+"\nEdición: "+edicion+"\nPrestado: "+prestado;
	}
}