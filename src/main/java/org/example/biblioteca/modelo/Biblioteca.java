package org.example.biblioteca.modelo;
import org.example.biblioteca.datos.GestorDatos;

import java.util.ArrayList;
import java.util.*;

public class Biblioteca {

	ArrayList<Libro> libros;
	ArrayList<Revista> revistas;
	GestorDatos gestor= new GestorDatos();

	/**
	 * 
	 * @param ISBN
	 */
	public Libro buscarlibroISBN(String ISBN) {
		// TODO - implement Biblioteca.buscarlibroISBN
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param autor
	 */
	public Libro buscarLibroAUTOR(String autor) {
		// TODO - implement Biblioteca.buscarLibroAUTOR
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param titulo
	 */
	public Libro buscarLibroTitulo(String titulo) {
		// TODO - implement Biblioteca.buscarLibroTitulo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ISSN
	 */
	public Revista buscarRevistaISSN(int ISSN) {
		// TODO - implement Biblioteca.buscarRevistaISSN
		throw new UnsupportedOperationException();
	}

	public void registroLibro(Libro libro) {
		gestor.registrarLibroArchivo(libro);
	}

	public void registroRevista(Revista revista) {
		gestor.registrarRevistaArchivo(revista);
	}

	/**
	 * 
	 * @param isbn
	 */
	public void prestarLibro(int isbn) {
		// TODO - implement Biblioteca.prestarLibro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param isbn
	 */
	public void devolverLibro(int isbn) {
		// TODO - implement Biblioteca.devolverLibro
		throw new UnsupportedOperationException();
	}


	public void prestarRevista(String issn, boolean estado) {
		boolean prestado=true;
		gestor.modificarPrestadoRevistaArchivo(issn,prestado);
	}

	/**
	 * 
	 * @param issn
	 */
	public void devolverRevista(int issn) {
		// TODO - implement Biblioteca.devolverRevista
		throw new UnsupportedOperationException();
	}
	public boolean existeLibro(String isbn){
		return gestor.existeLibro(isbn);
	}
	public boolean existeRevista(String issn){
		return gestor.existeRevista(issn);
	}


}