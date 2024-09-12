import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library extends Book{
    List<Book> books = new ArrayList<>();
    List<Author> authors = new ArrayList<>();

    Book codigoLimpo = new Book(1, "Código Limpo", new Author(1, "Robert C. Martin", LocalDate.of(1987, 4, 19)), false, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));

    Book entendendoAlgoritimos = new Book(2, "Entendendo Algoritmos", new Author(2, "Aditya Y. Bhargava", LocalDate.of(1928, 3, 17)), false, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));

    public List<Book> getBooks() {
        books.add(codigoLimpo);
        books.add(entendendoAlgoritimos);

        return books;
    }

    /*public void setBooks(List<Book> books) {
        this.books = books;
    }*/
}
