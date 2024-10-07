import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library extends Book {
    List<Book> books = new ArrayList<>();
    List<Author> authors = new ArrayList<>();
    List<WeLend> weLends = new ArrayList<>();

    public void addingBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getAvailableBooks() {
        List<Books> availableBooks =  new ArrayList<>;

        for(Book book: books) {
            if(book.isAvailable()) {
                availableBooks.add(book);
            break;
        }

        return availableBooks;
    }
    
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
