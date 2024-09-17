import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library extends Book {
    List<Book> books = new ArrayList<>();
    List<Author> authors = new ArrayList<>();
    List<WeLend> weLends = new ArrayList<>();

    Book codigoLimpo = new Book(1, "Código Limpo", new Author(1, "Robert C. Martin", LocalDate.of(1987, 4, 19)), true, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));

    Book entendendoAlgoritimos = new Book(2, "Entendendo Algoritmos", new Author(2, "Aditya Y. Bhargava", LocalDate.of(1928, 3, 17)), true, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));

    Book entendendo = new Book(3, "Entendendo", new Author(3, "Fulano", LocalDate.of(1950, 9, 19)), true, LocalDate.of(1987, 4, 19), LocalDate.of(1987, 4, 19));
    
    public Library() {
        books.add(entendendo);
        books.add(entendendoAlgoritimos);
        books.add(codigoLimpo);
    }

    public List<Book> getBooks() {
        return books;
    }

    public boolean lendingBook(int id, boolean available) {
        for(Book book: books) {
            try {
                if(book.getId() == id && book.available == true) {
                    book.setAvailable(false);
                    System.out.println("\nUpdated book" + book + "\n" + "Loan Date: " + LocalDate.now() + "\n");

                    WeLend loan = new WeLend(book);
                    weLends.add(loan);

                    return true;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage() + "This book is already borrowed");
            }
        }

        return false;
    }
}
