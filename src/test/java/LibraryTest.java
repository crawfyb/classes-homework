import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void set() {
        library = new Library(3);
        book1 = new Book("100 Years of Solitude", "Gabriel Garcia Marquez", "Fantasy");
        book2 = new Book("The Master and Margarita", "Mikhail Bulgakov,", "Satire");
        book3 = new Book("Cat's Cradle", "Kurt Vonnegut", "Science Fiction");
        book4 = new Book("The Wind Up Bird Chronicles", "Haruki Murakami", "Fantastique");
        library.addBook(book1);
        library.addBook(book2);

    }

    @Test
    public void libraryStartsWithBooks() {
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void hasCapacity() {
        library.addBook(book4);
        library.addBook(book3);
        assertEquals(3, library.bookCount());
    }


}
