package org.example.biblioteca.ventanaBiblioteca;

import org.example.biblioteca.modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;


public class VentanaRegistrar extends VentanaBase {

	private JButton btRegistrarLibro;
	private JButton btRegistrarRevista;
	private Biblioteca biblioteca;
	private JButton btRegresar;

	/**
	 * 
	 * @param biblioteca
	 */
	public VentanaRegistrar(Biblioteca biblioteca) {
		super("Menú Registrar", 800, 520);
		this.biblioteca = biblioteca;
	}

	public void generarBotonRegistrarLibro() {
		// TODO - implement VentanaRegistrar.generarBotonRegistrarLibro
		throw new UnsupportedOperationException();
	}

	public void generarBotonRegistrarRevista() {
		// TODO - implement VentanaRegistrar.generarBotonRegistrarRevista
		throw new UnsupportedOperationException();
	}

	public void generarBotonRegresar() {
		// TODO - implement VentanaRegistrar.generarBotonRegresar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		// TODO - implement VentanaRegistrar.actionPerformed
		throw new UnsupportedOperationException();
	}

}