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
		super("Menú", 500, 520);
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
		btRegistrar = generarBoton("Registrar", 150, 50, 150, 30);
		this.add(btRegistrar);
		btRegistrar.addActionListener(this);
	}
	public void generarBotonBuscar() {
		btBuscar = generarBoton("Buscar", 150, 150, 150, 30);
		this.add(btBuscar);
		btBuscar.addActionListener(this);
	}
	public void generarBotonPrestar() {
		btPrestar = generarBoton("Prestar", 150, 250, 150, 30);
		this.add(btPrestar);
		btPrestar.addActionListener(this);
	}

	public void generarBotonDevolver() {
		btDevolver = generarBoton("Devolver", 150, 350, 150, 30);
		this.add(btDevolver);
		btDevolver.addActionListener(this);
	}





	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btBuscar) {
			new VentanaBuscar(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegistrar) {
			new VentanaRegistrar(biblioteca);
			this.dispose();
		}
	}

}