package org.example.biblioteca.ventanaBiblioteca;

import org.example.biblioteca.modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaDevolver extends VentanaBase {

	private JButton btDevolverLibro;
	private JButton btDevolverRevista;
	private JButton btRegresar;
	private Biblioteca biblioteca;


	public VentanaDevolver(Biblioteca biblioteca) {
		super("Devolver", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}
	private void generarElementosVentana() {
		generarBotonDevolverRevista();
		generarBotonDevolverLibro();
		generarBotonRegresar();
	}

	public void generarBotonDevolverLibro() {
		btDevolverLibro = generarBoton("Devolver libro", 150, 50, 150, 30);
		this.add(btDevolverLibro);
		btDevolverLibro.addActionListener(this);
	}

	public void generarBotonDevolverRevista() {
		btDevolverRevista = generarBoton("Devolver revista", 150, 100, 150, 30);
		this.add(btDevolverRevista);
		btDevolverRevista.addActionListener(this);
	}

	public void generarBotonRegresar() {
		btRegresar = generarBoton("Regresar", 150, 250, 150, 30);
		this.add(btRegresar);
		btRegresar.addActionListener(this);
	}

	/**
	 * 
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btDevolverLibro) {
			new VentanaDevolverLibro(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btDevolverRevista) {
			new VentanaDevolverRevista(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}