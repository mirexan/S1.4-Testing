package Level_01.Lv1_Ex1.classes;

import Level_01.lvl1_Ex1.classes.Book;
import Level_01.lvl1_Ex1.classes.BookManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BookManagerTest {

	private BookManager manager;

	@BeforeEach
	public void setUp(){
		manager = new BookManager();
	}

	@Test
	public void listNotNull() {
		assertNotNull(manager.getLibrary());
	}
	@Test
	public void listCorrectSize() {
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		assertEquals(3,manager.getLibrary().size());
	}
	@Test
	public void addBookInPositionTest() {
		manager.addBook("Rashomon");
		manager.addBook("The death denial");
		manager.addBookInPosition("Mistborn I",1);
		assertEquals("Mistborn I",manager.getBookByPosition(0));
	}
	@Test
	public void noDupTest() {
		manager.addBook("Rashomon");
		manager.addBook("Rashomon");
		manager.addBook("Rashomon");
		assertEquals(1,manager.getLibrary().size());
	}
	@Test
	public void getBookInPositionTest() {
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		manager.addBook("Fundation");
		assertEquals("The death denial",manager.getBookByPosition(3));
	}
	@Test
	public void listCorrectAfterAdd() {
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		assertEquals(3,manager.getLibrary().size());
		manager.addBook("Fundation");
		assertEquals(4,manager.getLibrary().size());
	}
	@Test
	public void listCorrectAfterDelete() {
		manager.addBook("Rashomon");
		manager.addBook("Mistborn I");
		manager.addBook("The death denial");
		assertEquals(3,manager.getLibrary().size());
		manager.deleteBook("Rashomon");
		assertEquals(2,manager.getLibrary().size());
	}
	@Test
	public void listSortedAfterAdding() {
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
