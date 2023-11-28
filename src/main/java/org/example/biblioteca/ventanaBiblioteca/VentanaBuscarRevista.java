package org.example.biblioteca.ventanaBiblioteca;

import javax.swing.*;
import org.example.biblioteca.modelo.*;
import java.awt.event.ActionEvent;

public class VentanaBuscarRevista extends VentanaBase {

	private JTextField tfIssn;
	private JButton btRegresar;
	private Biblioteca biblioteca;
	private JButton btIngresar;

	/**
	 *
	 * @param biblioteca
	 */
	public VentanaBuscarRevista(Biblioteca biblioteca) {
		super("Buscar revista", 500, 520);
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

	public void generarBotonIngresar() {
		btIngresar = generarBoton("Ingresar", 250, 100, 100, 30);
		this.add(btIngresar);
		btIngresar.addActionListener(this);
	}

	public void generarBotonRegresar() {
		btRegresar = generarBoton("Regresar", 100, 100, 100, 30);
		this.add(btRegresar);
		btRegresar.addActionListener(this);
	}

	/**
	 *
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == btIngresar) {
			if (biblioteca.existeRevista(tfIssn.getText())){
				JOptionPane.showMessageDialog(this, biblioteca.buscarRevistaISSN(tfIssn.getText()));
			}else {
				JOptionPane.showMessageDialog(this, "La revista no existe");

			}
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}