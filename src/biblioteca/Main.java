package biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;
import biblioteca.modelo.Libro;
import biblioteca.servicio.Biblioteca;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        String opcion;

        separador();

        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Agregar un nuevo libro");
            System.out.println("2. Listar todos los libros");
            System.out.println("3. Buscar un libro por titulo");
            System.out.println("4. Eliminar un libro");
            System.out.print("5. Salir\n");
            separador();

            System.out.print("\nIngrese una opcion: ");
            opcion = scanner.nextLine();
            separador();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    separador();

                    System.out.print("Ingrese el autor: ");
                    String autor = scanner.nextLine();
                    separador();

                    System.out.print("Ingrese el año de publicacion: ");
                    int año = obtenerInt();
                    scanner.nextLine();
                    separador();

                    System.out.print("Ingrese el genero: ");
                    String genero = scanner.nextLine();
                    separador();

                    Libro nuevoLibro = new Libro(titulo, autor, año, genero);
                    biblioteca.agregarLibro(nuevoLibro);
                    break;

                case "2":
                    biblioteca.listarLibros();
                    break;

                case "3":
                    System.out.print("Ingrese el titulo a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    separador();
                    biblioteca.buscarPorTitulo(tituloBuscar);
                    break;

                case "4":
                    System.out.print("Ingrese el titulo del libro a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    separador();
                    biblioteca.eliminarLibro(tituloEliminar);
                    break;

                case "5":
                    System.out.println("Saliendo de la aplicacion...");
                    separador();
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    separador();
            }

        } while (!opcion.equals("5"));

        scanner.close();
    }

    public static void separador() {
        System.out.println("----------------------------------------\n");
    }

    // Sigue pidiendo el dato hasta que el usuario ingrese un numero valido
    private static int obtenerInt() {
        int i = 0;
        while (i == 0) {
            try {
                int nro = scanner.nextInt();
                i = nro;
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un valor numerico");
                scanner.next();
                System.out.print("Ingrese valor: ");
            }
        }
        return i;
    }
}
