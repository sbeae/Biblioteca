package org.example.biblioteca.ventanaBiblioteca;
import org.example.biblioteca.modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class VentanaRegistrarRevista extends VentanaBase {

	private JTextField tfTitulo;
	private JTextField tfAutor;
	private JTextField tfIssn;
	private JTextField tfNumero;
	private JButton btRegresar;
	private Biblioteca biblioteca;
	private JButton btIngresar;

	/**
	 *
	 * @param biblioteca
	 */
	public VentanaRegistrarRevista(Biblioteca biblioteca) {
		super("Registrar revista", 500, 520);
		this.biblioteca = biblioteca;
		generarElementosVentana();
	}
	private void generarElementosVentana() {
		generarTextTitulo();
		generarTextAutor();
		generarTextIssn();
		generarTextNumero();
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

	public void generarTextIssn() {
		String textoNombre = "ISBN:";
		super.generarLabel(textoNombre, 100, 180, 150, 20);
		tfIssn = super.generarTextField(100, 210, 250, 20);
		this.add(tfIssn);
	}

	public void generarTextNumero() {
		String textoNombre = "Edición:";
		super.generarLabel(textoNombre, 100, 260, 150, 20);
		tfNumero = super.generarTextField(100, 290, 250, 20);
		this.add(tfNumero);
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
	public Revista crearRevista() {
		String Autor = tfAutor.getText();
		String Titulo = tfTitulo.getText();
		String ISSN = tfIssn.getText();
		String Numero = tfNumero.getText();
		Revista revista = new Revista(Autor, Titulo, ISSN, Numero);
		return revista;
	}

	/**
	 *
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btIngresar) {
			if (!camposNoValidos()){
				Revista revista = crearRevista();
				biblioteca.registroRevista(revista);
				JOptionPane.showMessageDialog(this, "Revista registrado correctamente");
			}
		}
		if (event.getSource() == btRegresar) {
			new VentanaMenu(biblioteca);
			this.dispose();
		}
	}
	private void validarCampos() {
		String Autor = tfAutor.getText();
		String Titulo = tfTitulo.getText();
		String ISSN = tfIssn.getText();
		String Numero = tfNumero.getText();

		if (Autor.isBlank() || Titulo.isBlank() || ISSN.isBlank() || Numero.isBlank()){
			throw new RuntimeException("Debe completar todos los campos");
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

}