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
		super("Menú Registrar", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}
	private void generarElementosVentana() {
		generarBotonRegistrarLibro();
		generarBotonRegistrarRevista();
		generarBotonRegresar();
	}

	public void generarBotonRegistrarLibro() {
		btRegistrarLibro = generarBoton("Registrar libro", 150, 50, 150, 30);
		this.add(btRegistrarLibro);
		btRegistrarLibro.addActionListener(this);
	}

	public void generarBotonRegistrarRevista() {
		btRegistrarRevista = generarBoton("Registrar revista", 150, 100, 150, 30);
		this.add(btRegistrarRevista);
		btRegistrarRevista.addActionListener(this);
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
		if (event.getSource() == btRegistrarLibro) {
			new VentanaRegistrarLibro(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegistrarRevista) {
			new VentanaRegistrarRevista(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}