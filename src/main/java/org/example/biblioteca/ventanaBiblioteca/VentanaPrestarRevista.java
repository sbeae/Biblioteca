package org.example.biblioteca.ventanaBiblioteca;
import javax.swing.*;
import org.example.biblioteca.modelo.*;

import java.awt.event.ActionEvent;

public class VentanaPrestarRevista extends VentanaBase {

	private JTextField tfIssn;
	private Biblioteca biblioteca;
	private JButton btRegresar;
	private JButton btIngresar;

	/**
	 * 
	 * @param biblioteca
	 */
	public VentanaPrestarRevista(Biblioteca biblioteca) {
		super("Prestar revista", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}
	private void generarElementosVentana() {
		generarTextIssn();
		generarBotonIngresar();
		generarBotonRegresar();
	}

	public void generarTextIssn() {
		String textoNombre = "ISSN:";
		super.generarLabel(textoNombre, 100, 20, 150, 20);
		tfIssn = super.generarTextField(100, 50, 250, 20);
		this.add(tfIssn);
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

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btIngresar) {
			biblioteca.prestarRevista(tfIssn.getText(),true);
			JOptionPane.showMessageDialog(this, "Revista prestada correctamente");
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}