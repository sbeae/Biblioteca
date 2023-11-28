package org.example.biblioteca.ventanaBiblioteca;
import javax.swing.*;
import org.example.biblioteca.modelo.*;

import java.awt.event.ActionEvent;

public class VentanaPrestarLibro extends VentanaBase {

	private JTextField tfIsbn;
	private Biblioteca biblioteca;
	private JButton btRegresar;
	private JButton btIngresar;

	/**
	 * 
	 * @param biblioteca
	 */
	public VentanaPrestarLibro(Biblioteca biblioteca) {
		super("Prestar libro", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}
	private void generarElementosVentana() {
		generarTextIsbn();
		generarBotonIngresar();
		generarBotonRegresar();
	}
	public void generarTextIsbn() {
		String textoNombre = "ISBN:";
		super.generarLabel(textoNombre, 100, 20, 150, 20);
		tfIsbn = super.generarTextField(100, 50, 250, 20);
		this.add(tfIsbn);
	}

	public void generarBotonRegresar() {
		btRegresar = generarBoton("Regresar", 100, 100, 100, 30);
		this.add(btRegresar);
		btRegresar.addActionListener(this);
	}

	public void generarBotonIngresar() {
		btIngresar = generarBoton("Ingresar", 250, 100, 100, 30);
		this.add(btIngresar);
		btIngresar.addActionListener(this);
	}

	/**
	 * 
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btIngresar) {
			biblioteca.prestarLibro(tfIsbn.getText(),true);
			JOptionPane.showMessageDialog(this, "Libro prestado correctamente");
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}