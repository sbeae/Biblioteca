package org.example.biblioteca.datos;
import org.example.biblioteca.modelo.Libro;
import org.example.biblioteca.modelo.Revista;
import java.io.File;
import java.io.*;
import java.util.ArrayList;

public class GestorDatos {

	private String archivoLibros;
	private String archivoRevistas;

	public GestorDatos() {
		archivoLibros = "src/main/java/org/example/biblioteca/datos/libros.txt";
		archivoRevistas = "src/main/java/org/example/biblioteca/datos/revistas.txt";
	}
	public Libro buscarLibroIsbnArchivo(String isbn) {
		ArrayList<Libro> libros = obtenerLibros();
		for (Libro libro : libros) {
			if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
		}
		return null;
	}

	public Libro buscarLibroTituloArchivo(String titulo) {
		ArrayList<Libro> libros = obtenerLibros();
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(titulo))
				return libro;
		}
		return null;
	}

	public Libro buscarLibroAutorArchivo(String autor) {
		ArrayList<Libro> libros = obtenerLibros();
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(autor))
				return libro;
		}
		return null;
	}

	public Revista buscarRevistaIssnArchivo(String issn) {
		ArrayList<Revista> revistas = obtenerRevistas();
		for (Revista revista : revistas) {
			if (revista.getISSN().equals(issn))
				return revista;
		}
		return null;
	}

	public Revista buscarRevistaAutorArchivo(String autor) {
		ArrayList<Revista> revistas = obtenerRevistas();
		for (Revista revista : revistas) {
			if (revista.getAutor().equals(autor))
				return revista;
		}
		return null;
	}

	public Revista buscarRevistaTituloArchivo(String titulo) {
		ArrayList<Revista> revistas = obtenerRevistas();
		for (Revista revista : revistas) {
			if (revista.getTitulo().equals(titulo))
				return revista;
		}
		return null;
	}
	public ArrayList<Revista> obtenerRevistas() {
		ArrayList<Revista> revistas = new ArrayList<>();
		if (existeArchivoRevistas()) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(archivoRevistas));
				String linea = reader.readLine();
				while (linea != null) {
					String[] datos = linea.split(",");
					Revista revista = new Revista(datos[0], datos[1], (datos[2]), (datos[3]), Boolean.parseBoolean(datos[4]));
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
					Libro libro = new Libro(datos[0], datos[1], (datos[2]), (datos[3]), Boolean.parseBoolean(datos[4]));
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

	public boolean existeLibro(String isbn) {
		ArrayList<Libro> libros = obtenerLibros();
		for (Libro libro2 : libros){
			if (libro2.getIsbn().equals(isbn)) {
				return true;
			}
		}
		return false;
	}

	public boolean existeRevista(String issn) {
		ArrayList<Revista> revistas = obtenerRevistas();
		for (Revista revista2 : revistas){
			if (revista2.getISSN().equals(issn)) {
				return true;
			}
		}
		return false;
	}




	public void modificarPrestadoRevistaArchivo(String issn, boolean nuevoestado){
		try {

			File archivo = new File(archivoRevistas);
			ArrayList<String> lineas = leerArchivo(archivo, issn,nuevoestado);
			escribirArchivo(archivo,lineas);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void modificarPrestadoLibroArchivo(String issn, boolean nuevoestado){
		try {

			File archivo = new File(archivoLibros);
			ArrayList<String> lineas = leerArchivo(archivo, issn,nuevoestado);
			escribirArchivo(archivo,lineas);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ArrayList<String> leerArchivo(File archivo, String issn, boolean nuevoestado) throws IOException {
		ArrayList<String> lineas = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				lineas.add(actualizarEstado(linea, issn, nuevoestado));
			}
		}
		return lineas;
	}

	private String actualizarEstado(String linea, String issn, boolean nuevoestado) {
		String[] partes = linea.split(",");
		if ((partes[2]).equals(issn)) {
			return partes[0] + "," + partes[1] + "," + partes[2] + "," + partes[3] + ","+nuevoestado;
		} else {
			return linea;
		}
	}

	private void escribirArchivo(File archivo, ArrayList<String> lineas) throws IOException {
		try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
			for (String linea : lineas) {
				pw.println(linea);
			}
		}
	}




}