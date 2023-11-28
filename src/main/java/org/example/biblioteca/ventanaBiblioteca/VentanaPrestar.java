package org.example.biblioteca.ventanaBiblioteca;
import org.example.biblioteca.modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrestar extends VentanaBase {

	private JButton btPrestarLibro;
	private JButton btPrestarRevista;
	private JButton btRegresar;
	private Biblioteca biblioteca;

	/**
	 * 
	 * @param biblioteca
	 */
	public VentanaPrestar(Biblioteca biblioteca) {
		super("Prestar", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}

	public void generarBotonPrestarLibro() {
		// TODO - implement VentanaPrestar.generarBotonPrestarLibro
		throw new UnsupportedOperationException();
	}

	public void generarBotonPrestarRevista() {
		// TODO - implement VentanaPrestar.generarBotonPrestarRevista
		throw new UnsupportedOperationException();
	}

	public void generarBotonRegresar() {
		// TODO - implement VentanaPrestar.generarBotonRegresar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		// TODO - implement VentanaPrestar.actionPerformed
		throw new UnsupportedOperationException();
	}

}