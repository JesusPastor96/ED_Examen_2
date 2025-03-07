package biblioteca;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiblicalTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();


    @BeforeEach
    void setUp() {
        Libro libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro));
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(libro));
        assertFalse(biblioteca.getLibros().contains(libro));
    }

    @Test
    void getLibros() {
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro);
        assertEquals(2, biblioteca.getLibros().size());
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro);
        assertEquals(libro, biblioteca.encuentraLibroPorTitulo("The Art of Computer Programming"));
        assertNull(biblioteca.encuentraLibroPorTitulo("The Art of Computer Programming"));
    }

    @Test
    void encuentraLibrosPorAutor() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);
        assertNotNull(biblio.getLibros());
        assertEquals(biblio.getLibros().size(), 1);
        assertTrue(biblio.getLibros().contains(this.libro));
    }
}
