package JUnit.n1exercise1;
import JUnit.n1exercise1.Library;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    Library library;
    @BeforeEach
    public void beforeTest() {
        library = new Library();
        library.addBook("The Great Gatsby");
        library.addBookByPosition("Little Women",0);
        library.addBook("Pride and Prejudice");
        library.addBook("Pride and Prejudice");
    }

    @Test
    void libraryIsNotNullAfterCreation() {
        assertNotNull(library.getBooks());
    }

    @Test
    void librarySizeAfterAddingBooks() {
        Assertions.assertEquals(3,library.getBooks().size());
    }

    @Test
    void noDuplicateBooks() {
        List<String> books = library.getBooks();
        Set<String> bookSet = new HashSet<>(books);
        assertEquals(books.size(),bookSet.size());
    }

    @Test
    void bookIsInCorrectPosition() {
        String expectedBook = "Little Women";
        int position = 0;
        Assertions.assertEquals(expectedBook,library.getBook(position));
    }

    @Test
    void titleIsInCorrectPosition() {
      Assertions.assertEquals("The Great Gatsby",library.getBook(1));
      Assertions.assertEquals("Little Women", library.getBook(0));
      Assertions.assertEquals("Pride and Prejudice", library.getBook(2));
    }

    @Test
    void addBookModifiesListCorrectly(){
        int initialSize = library.getBooks().size();
        library.addBook("War and Peace");
        Assertions.assertEquals(initialSize + 1,library.getBooks().size());
    }

    @Test
    void removeBookModifiesListCorrectly(){
        int initialSize = library.getBooks().size();
        library.removeBook("Pride and Prejudice");
        Assertions.assertEquals(initialSize - 1,library.getBooks().size());
    }

    @Test
    void testSortedlist(){
        List<String> sortedBookList = new ArrayList<>(library.getBooks());
        Collections.sort(sortedBookList);
        library.sortBooks();
        Assertions.assertTrue(library.getBooks().equals(sortedBookList));
    }
}
