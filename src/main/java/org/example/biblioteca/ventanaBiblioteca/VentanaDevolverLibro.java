package org.example.biblioteca.ventanaBiblioteca;

import org.example.biblioteca.modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaDevolverLibro extends VentanaBase {

	private JTextField tfIsbn;
	private JButton btRegresar;
	private Biblioteca biblioteca;
	private JButton btIngresar;

	/**
	 * 
	 * @param biblioteca
	 */
	public VentanaDevolverLibro(Biblioteca biblioteca) {
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
			biblioteca.devolverLibro(tfIsbn.getText(),false);
			JOptionPane.showMessageDialog(this, "Libro devuelto correctamente");
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}