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

	private void generarElementosVentana() {
		generarBotonBuscarLIbro();
		generarBuscarRevista();
		generarBotonRegresar();
	}

	public void generarBotonBuscarLIbro() {
		btBuscarLibro = generarBoton("Buscar libro", 150, 50, 150, 30);
		this.add(btBuscarLibro);
		btBuscarLibro.addActionListener(this);
	}

	public void generarBuscarRevista() {
		btBuscarRevista = generarBoton("Buscar revista", 150, 100, 150, 30);
		this.add(btBuscarRevista);
		btBuscarRevista.addActionListener(this);
	}

	public void generarBotonRegresar() {
		btRegresar = generarBoton("Regresar", 150, 250, 150, 30);
		this.add(btRegresar);
		btRegresar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btBuscarLibro) {
			new VentanaBuscarLibro(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btBuscarRevista) {
			new VentanaBuscarRevista(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}
}