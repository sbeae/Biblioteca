package org.example.biblioteca.ventanaBiblioteca;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class VentanaBase extends JFrame implements ActionListener{

	private final Font fuenteTexto;

	public VentanaBase(String nombre, int largoX, int largoY){
		super(nombre);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(largoX, largoY);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		this.setLayout(null);
		this.fuenteTexto = new Font("Calibri", Font.BOLD, 14);
	}

	public JButton generarBoton(String text, int locationX, int locationY, int largoX, int largoY) {
		JButton boton = new JButton(text);
		boton.setBounds(locationX, locationY, largoX, largoY);
		return boton;
	}

	public void generarLabel(String text, int locationX, int locationY, int largoX, int largoY) {
		JLabel label = new JLabel(text);
		label.setBounds(locationX, locationY, largoX, largoY);
		this.add(label);
	}
	public JTextField generarTextField(int locationX, int locationY, int largoX, int largoY) {
		JTextField textField = new JTextField();
		textField.setBounds(locationX, locationY, largoX, largoY);
		return textField;
	}
	public void actionPerformed(ActionEvent e){
		throw new UnsupportedOperationException("Not supported yet.");
	}

}