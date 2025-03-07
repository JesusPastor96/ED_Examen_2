package biblioteca;

/**
 * Clase que representa un libro con título, autor y año de publicación.
 *
 * @author Jesús Pastor Ricoy
 */
public class Libro {
    /** Título del libro */
    private String titulo;
    /** Autor del libro */
    private String autor;
    /** Año de publicación del libro */
    private int anioPublicacion;

    /**
     * Constructor para crear un nuevo libro
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param anioPublicacion Año de publicación del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el título del libro
     * @return Título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro
     * @param titulo Nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro
     * @return Autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro
     * @param autor Nuevo autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro
     * @return Año de publicación del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Establece el año de publicación del libro
     * @param anioPublicacion Nuevo año de publicación del libro
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
