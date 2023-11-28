package org.example;

import org.example.biblioteca.modelo.Biblioteca;
import org.example.biblioteca.ventanaBiblioteca.VentanaMenu;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        new VentanaMenu(biblioteca);
    }
}

