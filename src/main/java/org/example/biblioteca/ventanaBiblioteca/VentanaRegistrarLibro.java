package org.example.biblioteca.ventanaBiblioteca;

import javax.swing.*;
import org.example.biblioteca.modelo.*;
import java.awt.event.ActionEvent;
public class VentanaRegistrarLibro extends VentanaBase {

	private JTextField tfTitulo;
	private JTextField tfAutor;
	private JTextField tfIsbn;
	private JTextField tfEdicion;
	private JButton btRegresar;
	private Biblioteca biblioteca;
	private JButton btIngresar;

	/**
	 *
	 * @param biblioteca
	 */
	public VentanaRegistrarLibro(Biblioteca biblioteca) {
		super("Buscar libro", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}
	private void generarElementosVentana() {
		generarTextTitulo();
		generarTextAutor();
		generarTextIsbn();
		generarTextEdicion();
		generarBotonRegresar();
		generarBotonIngresar();
	}
	public void generarTextTitulo() {
		String textoNombre = "Titulo:";
		super.generarLabel(textoNombre, 100, 20, 150, 20);
		tfTitulo = super.generarTextField(100, 50, 250, 20);
		this.add(tfTitulo);
	}

	public void generarTextAutor() {
		String textoNombre = "Autor:";
		super.generarLabel(textoNombre, 100, 100, 150, 20);
		tfAutor = super.generarTextField(100, 130, 250, 20);
		this.add(tfAutor);
	}

	public void generarTextIsbn() {
		String textoNombre = "ISBN:";
		super.generarLabel(textoNombre, 100, 180, 150, 20);
		tfIsbn = super.generarTextField(100, 210, 250, 20);
		this.add(tfIsbn);
	}

	public void generarTextEdicion() {
		String textoNombre = "Edición:";
		super.generarLabel(textoNombre, 100, 260, 150, 20);
		tfEdicion = super.generarTextField(100, 290, 250, 20);
		this.add(tfEdicion);
	}

	public void generarBotonRegresar() {
		btIngresar = generarBoton("Ingresar", 250, 350, 100, 30);
		this.add(btIngresar);
		btIngresar.addActionListener(this);
	}

	public void generarBotonIngresar() {
		btRegresar = generarBoton("Regresar", 100, 350, 100, 30);
		this.add(btRegresar);
		btRegresar.addActionListener(this);
	}

	public Libro crearLibro() {
		String Autor = tfAutor.getText();
		String Titulo = tfTitulo.getText();
		String ISBN = tfIsbn.getText();
		String Edicion = tfEdicion.getText();
		Libro libro = new Libro(Autor, Titulo, ISBN, Edicion);
		return libro;
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btIngresar) {
			if (!camposNoValidos()){
				Libro libro = crearLibro();
				biblioteca.registroLibro(libro);
				JOptionPane.showMessageDialog(this, "Libro registrado correctamente");
			}
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}

	}
	private boolean camposNoValidos() {
		try {
			validarCampos();
			return false;
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			return true;
		}
	}
	private void validarCampos() {
		String Autor = tfAutor.getText();
		String Titulo = tfTitulo.getText();
		String ISBN = tfIsbn.getText();
		String Edicion = tfEdicion.getText();

		if (Autor.isBlank() || Titulo.isBlank() || ISBN.isBlank() || Edicion.isBlank()){
			throw new RuntimeException("Debe completar todos los campos");
		}

	}
}