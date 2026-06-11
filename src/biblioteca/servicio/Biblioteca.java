package biblioteca.servicio;

import java.util.ArrayList;
import java.util.List;
import biblioteca.Main;
import biblioteca.modelo.Libro;

public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("Error: el libro no puede ser nulo.");
            Main.separador();
            return;
        }
        if (libro.getTitulo().isEmpty() || libro.getTitulo().isBlank()) {
            System.out.println("Error: el titulo no puede estar vacio.");
            Main.separador();
            return;
        }
        if (libro.getAutor().isEmpty() || libro.getAutor().isBlank()) {
            System.out.println("Error: el autor no puede estar vacio.");
            Main.separador();
            return;
        }
        // El año debe ser un valor positivo y razonable
        if (libro.getAñoPublicacion() <= 0) {
            System.out.println("Error: el año de publicacion debe ser un valor positivo.");
            Main.separador();
            return;
        }
        this.libros.add(libro);
        System.out.println("Libro agregado correctamente.");
        Main.separador();
    }

    public void listarLibros() {
        if (this.libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            Main.separador();
            return;
        }
        System.out.println("Lista de libros:");
        for (Libro libro : this.libros) {
            System.out.println(libro);
        }
        Main.separador();
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> encontrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                encontrados.add(libro);
            }
        }
        if (encontrados.isEmpty()) {
            System.out.println("No se encontraron libros con el titulo: " + titulo);
        } else {
            System.out.println("Libros encontrados:");
            for (Libro libro : encontrados) {
                System.out.println(libro);
            }
        }
        Main.separador();
        return encontrados;
    }

    public void eliminarLibro(String titulo) {
        Libro libroAEliminar = null;
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libroAEliminar = libro;
                break;
            }
        }
        if (libroAEliminar != null) {
            this.libros.remove(libroAEliminar);
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("No se encontro un libro con el titulo: " + titulo);
        }
        Main.separador();
    }
}
