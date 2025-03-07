package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una coleccion de libros
 * Permite agregar, eliminar y buscar libros por titulo y por autor
 *
 * @see Libro
 * @author Jesús Pastor Ricoy
 * @version 7.3.2025
 */
public class Biblioteca {
    /** Lista de libros disponibles en la biblioteca */
    private final List<Libro> libros;

    /**Constructor por defecto de la biblioteca sin libros*/
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor con parametros
     * @param libros Lista de libros a agregar a la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca
     * @param libro Libro a agregar
     * @see Libro
     * @return {@code true} si el liibro se ha agregado correctamente o {code false} si el libro No se ha agregado correctamente
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca
     * @param libro Libro a eliminar
     * @return true si el libro fue eliminado con éxito, false si no se encontró
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros de la biblioteca
     * @return Lista de libros en la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por su título en la biblioteca.
     * @param titulo
     * @return El libro si se encuentra, null si no existe.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Este método está obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)} en su lugar.
     * @param autor Autor del libro a buscar.
     * @return El primer libro encontrado por el autor, o null si no existe.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca libros por autor en la biblioteca
     * @since V2.0
     * @param autor Autor de los libros a buscar.
     * @return Lista de libros del autor especificado o una lista vacía si no hay coincidencias.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}