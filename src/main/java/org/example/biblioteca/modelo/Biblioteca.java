package org.example.biblioteca.modelo;
import org.example.biblioteca.datos.GestorDatos;

import java.util.ArrayList;
import java.util.*;

public class Biblioteca {

	ArrayList<Libro> libros;
	ArrayList<Revista> revistas;
	GestorDatos gestor= new GestorDatos();


	public String buscarlibroISBN(String ISBN) {
		Libro libro=gestor.buscarLibroIsbnArchivo(ISBN);
		return libro.toStringMostrar();
	}

	public String buscarRevistaISSN(String ISSN) {
		Revista revista=gestor.buscarRevistaIssnArchivo(ISSN);
		return revista.toStringMostrar();
	}

	public void registroLibro(Libro libro) {
		gestor.registrarLibroArchivo(libro);
	}

	public void registroRevista(Revista revista) {
		gestor.registrarRevistaArchivo(revista);
	}

	public void prestarLibro(String isbn, boolean estado) {
		boolean prestado=true;
		gestor.modificarPrestadoLibroArchivo(isbn,prestado);
	}

	/**
	 * 
	 * @param isbn
	 */
	public void devolverLibro(String isbn, boolean estado) {
		boolean prestado=false;
		gestor.modificarPrestadoLibroArchivo(isbn,prestado);
	}


	public void prestarRevista(String issn, boolean estado) {
		boolean prestado=true;
		gestor.modificarPrestadoRevistaArchivo(issn,prestado);
	}

	/**
	 * 
	 * @param issn
	 */
	public void devolverRevista(String issn, boolean estado) {
		boolean prestado= false;
		gestor.modificarPrestadoRevistaArchivo(issn, prestado);
	}
	public boolean existeLibro(String isbn){
		return gestor.existeLibro(isbn);
	}
	public boolean existeRevista(String issn){
		return gestor.existeRevista(issn);
	}


}