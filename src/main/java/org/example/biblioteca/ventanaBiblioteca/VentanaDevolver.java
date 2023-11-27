package org.example.biblioteca.ventanaBiblioteca;

import org.example.biblioteca.modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaDevolver extends VentanaBase {

	private JButton btDevolverLibro;
	private JButton btDevolverRevista;
	private JButton btRegresar;
	private Biblioteca biblioteca;

	/**
	 * 
	 * @param biblioteca
	 */
	public VentanaDevolver(Biblioteca biblioteca) {
		super("Menú Devolver", 800, 520);
		this.biblioteca = biblioteca;
	}

	public void generarBotonDevolverLibro() {
		// TODO - implement VentanaDevolver.generarBotonDevolverLibro
		throw new UnsupportedOperationException();
	}

	public void generarBotonDevolverRevista() {
		// TODO - implement VentanaDevolver.generarBotonDevolverRevista
		throw new UnsupportedOperationException();
	}

	public void generarBotonRegresar() {
		// TODO - implement VentanaDevolver.generarBotonRegresar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		// TODO - implement VentanaDevolver.actionPerformed
		throw new UnsupportedOperationException();
	}

}