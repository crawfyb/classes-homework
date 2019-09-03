import org.junit.Before;

public class BookTest {


    Book book;

    @Before
    public void set() {
        book = new Book("100 Years of Solitude", "Gabriel Garcia Marquez", "Fantasy");
    }
}
