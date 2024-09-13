import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Library extends Book {
    List<Book> books = new ArrayList<>();
    List<Author> authors = new ArrayList<>();

    Book codigoLimpo = new Book(1, "Código Limpo", new Author(1, "Robert C. Martin", LocalDate.of(1987, 4, 19)), false, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));

    Book entendendoAlgoritimos = new Book(2, "Entendendo Algoritmos", new Author(2, "Aditya Y. Bhargava", LocalDate.of(1928, 3, 17)), true, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));

    Book entendendo = new Book(3, "Entendendo", new Author(3, "Fulano", LocalDate.of(1950, 9, 19)), false, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));
    
    public List<Book> getBooks() {
        books.add(entendendo);
        books.add(entendendoAlgoritimos);
        books.add(codigoLimpo);

        return books;
    }

    public boolean lendingBook(int id, boolean availability) {
        for(Book book: books) {
            if(book.getId() == id) {
                book.setAvailable(availability);
                System.out.println("\nUpdated book" + book + "\n");
                return true;
            }
        }

        System.out.println("Book with id: " + id + "not found.");
        return false;
    }

    /*public void setBooks(List<Book> books) {
        this.books = books;
    }*/
}
