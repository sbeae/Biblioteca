package org.example.biblioteca.modelo;

public class Libro extends MaterialBiblioteca implements Prestable {

	private String titulo;
	private String autor;
	private boolean prestado;
	private int ISBN;
	private int edicion;

	public Libro(String titulo, String autor, int isbn, int edicion){
		titulo=titulo;
		autor=autor;
		prestado=false;
		ISBN=isbn;
		edicion=edicion;
	}
	public Libro(String titulo, String autor, int isbn, int edicion,boolean prestado){
		titulo=titulo;
		autor=autor;
		prestado=prestado;
		ISBN=isbn;
		edicion=edicion;

	}

	public int getEdicion() {
		return this.edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public int getIsbn(){
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
}