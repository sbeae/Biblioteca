package org.example.biblioteca.datos;
import org.example.biblioteca.modelo.Libro;
import org.example.biblioteca.modelo.Revista;
import java.io.File;
import java.io.*;
import java.util.ArrayList;

public class GestorDatos {

	private String archivoLibros;
	private String archivoRevistas;

	public GestorDatos(){
		archivoLibros="libros.txt";
		archivoRevistas="revistas.txt";
	}


	public Libro buscarLibroIsbnArchivo(int isbn){
		ArrayList<Libro> libros = obtenerLibros();
		for(Libro libro: libros){
			if(libro.getIsbn()==isbn)
				return libro;
			}
		return null;
		}
	public Revista 




	public ArrayList<Revista> obtenerRevistas() {
		ArrayList<Revista> revistas = new ArrayList<>();
		if (existeArchivoRevistas()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(archivoRevistas));
				String linea = reader.readLine();
				while (linea != null) {
					String[] datos = linea.split(",");
					Revista revista = new Revista(datos[0], datos[1], Integer.parseInt(datos[2]), Integer.parseInt(datos[3]),Boolean.parseBoolean(datos[4]));
					revistas.add(revista);
					linea = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return revistas;
	}

	public ArrayList<Libro> obtenerLibros() {
		ArrayList<Libro> libros = new ArrayList<>();
		if (existeArchivoLibros()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(archivoLibros));
				String linea = reader.readLine();
				while (linea != null) {
					String[] datos = linea.split(",");
					Libro libro = new Libro(datos[0], datos[1], Integer.parseInt(datos[2]), Integer.parseInt(datos[3]),Boolean.parseBoolean(datos[4]));
					libros.add(libro);
					linea = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return libros;
	}

		public boolean existeArchivoLibros() {
			//Se verifica si existe el archivo con el nombre "nombreArchivo"
			File file = new File(archivoLibros);
			return file.exists();
		}
		public boolean existeArchivoRevistas() {
			//Se verifica si existe el archivo con el nombre "nombreArchivo"
			File file = new File(archivoRevistas);
			return file.exists();
		}

	public Libro buscarLibroTituloArchivo(String titulo) {
	}

	/**
	 * 
	 * @param autor
	 */
	public Libro buscarLibroAutorArchivo(String autor) {
		// TODO - implement GestorDatos.buscarLibroAutorArchivo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param issn
	 */
	public Revista buscarRevistaIssnArchivo(String issn) {
		// TODO - implement GestorDatos.buscarRevistaIssnArchivo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param autor
	 */
	public Revista buscarRevistaAutorArchivo(String autor) {
		// TODO - implement GestorDatos.buscarRevistaAutorArchivo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param titulo
	 */
	public Revista buscarRevistaTituloArchivo(String titulo) {
		// TODO - implement GestorDatos.buscarRevistaTituloArchivo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param libro
	 */
	public void registrarLibroArchivo(Libro libro) {
		try {
			//Agregar planta a un archivo existente
			BufferedWriter writer = new BufferedWriter(new FileWriter(archivoLibros, true));
			writer.write(libro.toString());
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void registrarRevistaArchivo(Revista revista) {
		try {
			//Agregar planta a un archivo existente
			BufferedWriter writer = new BufferedWriter(new FileWriter(archivoRevistas, true));
			writer.write(revista.toString());
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean existeLibro(Libro libro) {
		// TODO - implement GestorDatos.existeLibro
		throw new UnsupportedOperationException();
	}
	ArrayList<Planta> plantas = obtenerPlantasArchivo();
        for(Planta planta: plantas){
		if(planta.getNombre().equals(plant.getNombre()) && planta.getId()==plant.getId()){
			return true;
		}
	}
        return false;
	public boolean existeRevista(Revista revista) {
		// TODO - implement GestorDatos.existeRevista
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param isbn
	 */
	public void prestarLibroArchivo(int isbn) {
		// TODO - implement GestorDatos.prestarLibroArchivo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param isbn
	 */
	public void devolverLibroArchivo(int isbn) {
		// TODO - implement GestorDatos.devolverLibroArchivo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param issn
	 */
	public void prestarRevistaArchivo(int issn) {
		// TODO - implement GestorDatos.prestarRevistaArchivo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param issn
	 */
	public void devolverRevistaArchivo(int issn) {
		// TODO - implement GestorDatos.devolverRevistaArchivo
		throw new UnsupportedOperationException();
	}

}