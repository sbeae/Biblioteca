package org.example.biblioteca.ventanaBiblioteca;

import javax.swing.*;
import org.example.biblioteca.modelo.*;
import java.awt.event.ActionEvent;

public class VentanaBuscar extends VentanaBase {

	private JButton btBuscarLibro;
	private JButton btBuscarRevista;
	private JButton btRegresar;
	private final Biblioteca biblioteca;


	public VentanaBuscar(Biblioteca biblioteca) {
		super("Buscar", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}
	public int getCentro(int largo){
		return this.getWidth() / 2 - largo;
	}
	private void generarElementosVentana() {
		generarBotonBuscarLIbro();
		generarBuscarRevista();
		generarBotonRegresar();
	}

	public void generarBotonBuscarLIbro() {
		btBuscarLibro = generarBoton("Buscar libro", getCentro(200), 100, 100, 30);
		this.add(btBuscarLibro);
		btBuscarLibro.addActionListener(this);
	}

	public void generarBuscarRevista() {
		btBuscarRevista = generarBoton("Buscar revista", getCentro(200), 50, 100, 30);
		this.add(btBuscarRevista);
		btBuscarRevista.addActionListener(this);
	}
	public void generarBotonRegresar() {
		btRegresar = generarBoton("Buscar revista", getCentro(200), 10, 100, 30);
		this.add(btRegresar);
		btRegresar.addActionListener(this);
	}
	/**
	 * 
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btBuscarLibro) {
			new VentanaBuscarLibro(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btBuscarRevista){
			new VentanaBuscarRevista(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}



}