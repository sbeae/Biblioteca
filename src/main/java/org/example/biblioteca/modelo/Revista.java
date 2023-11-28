package org.example.biblioteca.modelo;
import org.example.biblioteca.modelo.MaterialBiblioteca;
import org.example.biblioteca.modelo.Prestable;

public class Revista extends MaterialBiblioteca implements Prestable {

	private String titulo;
	private String autor;
	private String ISSN;
	private String numero;
	private boolean prestado;

	public Revista(String titulo, String autor, String issn, String numero){
		this.titulo= titulo;
		this.autor=autor;
		this.ISSN = issn;
		this.numero= numero;
		this.prestado=false;
	}
	public Revista(String titulo, String autor, String issn, String numero,boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISSN = issn;
		this.numero = numero;
		this.prestado = prestado;
	}
	public String toStringMostrar(){
		return "Título: "+titulo+"\nAutor: "+autor+"\nISBN: "+ISSN+"\nNúmero: "+numero+"\nPrestado: "+prestado;

	}
	public String getISSN() {
		return this.ISSN;
	}

	public void setISSN(String ISSN) {
		this.ISSN = ISSN;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void prestar(){
		prestado=true;
	}
	public void devolver(){
		prestado=false;
	}
	public String toString(){
		return titulo+","+autor+","+ISSN+","+numero+","+prestado;
	}

}