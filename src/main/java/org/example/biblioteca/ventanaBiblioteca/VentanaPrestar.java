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
	private void generarElementosVentana() {
		generarBotonPrestarLibro();
		generarBotonPrestarRevista();
		generarBotonRegresar();
	}
	public int getCentro(int largo){
		return this.getWidth() / 2 - largo;
	}

	public void generarBotonPrestarLibro() {
		btPrestarLibro = generarBoton("Prestar libro", 150, 50, 150, 30);
		this.add(btPrestarLibro);
		btPrestarLibro.addActionListener(this);

	}

	public void generarBotonPrestarRevista() {
		btPrestarRevista = generarBoton("Prestar revista", 150, 100, 150, 30);
		this.add(btPrestarRevista);
		btPrestarRevista.addActionListener(this);

	}

	public void generarBotonRegresar() {
		btRegresar = generarBoton("Regresar", 150, 250, 150, 30);
		this.add(btRegresar);
		btRegresar.addActionListener(this);
	}


	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btPrestarLibro) {
			new VentanaPrestarLibro(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btPrestarRevista) {
			new VentanaPrestarRevista(biblioteca);
			this.dispose();
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}