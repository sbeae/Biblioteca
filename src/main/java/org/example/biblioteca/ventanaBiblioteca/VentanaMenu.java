package org.example.biblioteca.ventanaBiblioteca;

import org.example.biblioteca.modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaMenu extends VentanaBase {

	private Biblioteca biblioteca;
	private JButton btRegistrar;
	private JButton btBuscar;
	private JButton btPrestar;
	private JButton btDevolver;


	public VentanaMenu(Biblioteca biblioteca) {
		super("Menú", 800, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();

	}
	private void generarElementosVentana() {
		generarBotonBuscar();
		generarBotonRegistrar();
		generarBotonPrestar();
		generarBotonDevolver();
	}

	public void generarBotonRegistrar() {
		btRegistrar = generarBoton("Registrar", getCentro(200), 150, 100, 30);
		this.add(btRegistrar);
		btRegistrar.addActionListener(this);
	}
	public int getCentro(int largo){
		return this.getWidth() / 2 - largo;
	}

	public void generarBotonPrestar() {
		btPrestar = generarBoton("Prestar", getCentro(200), 110, 100, 30);
		this.add(btPrestar);
		btPrestar.addActionListener(this);
	}

	public void generarBotonDevolver() {
		btDevolver = generarBoton("Devolver", getCentro(200), 60, 100, 30);
		this.add(btDevolver);
		btDevolver.addActionListener(this);
	}

	public void generarBotonBuscar() {
		btBuscar = generarBoton("Buscar", getCentro(200), 20, 100, 30);
		this.add(btBuscar);
		btBuscar.addActionListener(this);
	}

	/**
	 * 
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btBuscar) {
			new VentanaBuscar(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegistrar){
			new VentanaRegistrar(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btPrestar) {
			new VentanaPrestar(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btDevolver) {
			new VentanaDevolver(biblioteca);
			this.dispose();
		}
	}

}