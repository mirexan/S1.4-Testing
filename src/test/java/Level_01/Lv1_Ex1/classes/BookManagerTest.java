package Level_01.Lv1_Ex1.classes;

import Level_01.Lvl1_Ex1.classes.Book;
import Level_01.Lvl1_Ex1.classes.BookManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/*Verifica el seu correcte funcionament amb JUnit:

    Verifiquen que la llista de llibres no és nul·la després de crear un nou objecte.
    Confirmen que la llista té una mida esperada després d'inserir diversos llibres.
    Asseguren que la llista conté un llibre específic en la seva posició correcta.
    Verifiquen que no hi ha títols de llibres duplicats a la llista.
    Comproven que es pot recuperar el títol d'un llibre donada una posició específica.
    Asseguren que afegir un llibre modifica correctament la llista.
    Confirmen que eliminar un llibre disminueix la mida de la llista.
    Verifiquen que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.*/

public class BookManagerTest {

	@Test
	public void listNotNull() {
		BookManager manager = new BookManager();
		assertNotNull(manager.getLibrary());
	}
	@Test
	public void listCorrectSize() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		assertEquals(3,manager.getLibrary().size());
	}
	@Test
	public void addBookInPositionTest() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("The death denial");
		manager.addBookInPosition("Mistborn I",1);
		assertEquals("Mistborn I",manager.getBookByPosition(0));
	}
	@Test
	public void noDupTest() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("Rashomon");
		manager.addBook("Rashomon");
		assertEquals(1,manager.getLibrary().size());
	}
	@Test
	public void getBookInPositionTest() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		manager.addBook("Fundation");
		assertEquals("The death denial",manager.getBookByPosition(3));
	}
	@Test
	public void listCorrectAfterAdd() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		assertEquals(3,manager.getLibrary().size());
		manager.addBook("Fundation");
		assertEquals(4,manager.getLibrary().size());
	}
	@Test
	public void listCorrectAfterDelete() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		assertEquals(3,manager.getLibrary().size());
		manager.deleteBook("Rashomon");
		assertEquals(2,manager.getLibrary().size());
	}
	@Test
	public void listSortedAfterAdding() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		manager.addBook("Fundation");
		Set<Book> sortedBooks = new TreeSet<Book> (manager.getLibrary());
		List<Book> expected = new ArrayList<Book>(sortedBooks);
		List<Book> actual = manager.getLibrary();
		assertEquals(expected,actual);
	}
	@Test
	public void listSortedAfterDeleting() {
		BookManager manager = new BookManager();
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		manager.addBook("Fundation");
		manager.deleteBook("Rashomon");
		Set<Book> sortedBooks = new TreeSet<Book> (manager.getLibrary());
		List<Book> expected = new ArrayList<Book>(sortedBooks);
		List<Book> actual = manager.getLibrary();
		assertEquals(expected,actual);
	}
}
