package org.example.biblioteca.ventanaBiblioteca;
import javax.swing.*;
import org.example.biblioteca.modelo.*;

import java.awt.event.ActionEvent;

public class VentanaBuscarLibro extends VentanaBase {

	private JTextField tfIsbn;
	private JButton btRegresar;
	private Biblioteca biblioteca;
	private JButton btIngresar;

	/**
	 *
	 * @param biblioteca
	 */
	public VentanaBuscarLibro(Biblioteca biblioteca) {
		super("Buscar libro", 500, 520);
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
			if (biblioteca.existeLibro(tfIsbn.getText())){
				JOptionPane.showMessageDialog(this, biblioteca.buscarlibroISBN(tfIsbn.getText()));
			}else {
				JOptionPane.showMessageDialog(this, "El libro no existe");
			}
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}

}