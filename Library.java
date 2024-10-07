import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
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
        List<Book> availableBooks = new ArrayList<>();

        for(Book book: books) {
            if(book.isAvailable()) {
                availableBooks.add(book);
            }
        }

        return availableBooks;
    }

    public Book getBookForId(int id) {
        for(Book book: books) {
            if(book.getId() == id) {
                return book;
            }
        }

        return null;
    }

    public void updateBook(int id, String newTitle) {
        for(Book book: books) {
            if(book.getId() == id) {
                book.setTitle(newTitle);
                break;
            }
        }
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public void addAuthors(Author author) {
        authors.add(author);
    }

    public List<Author> listAuthors() {
        return authors;
    }

    public void updateAuthor(int id, String newName) {
        for(Author author: authors) {
            if(author.getId() == id) {
                author.setName(newName);
                break;
            }
        }
    }

    public void removeAuthor(int id) {
        authors.removeIf(author -> author.getId() == id);
    }

    public void lendBook(Book book, String username) {
        if(book.isAvailable()) {
            WeLend weLend = new WeLend(book, username);
            weLends.add(weLend);
            book.setAvailable(false);
        } else {
            System.out.println("Book not available for loan");
        }
    }

    public void returnBook(int idLoan) {
        for (WeLend weLend: weLends) {
            if(weLend.getId() == idLoan && weLend.isActive()) {
                weLend.returnBook();
                break;
            }
        }   
    }

    public List<WeLend> listLoan() {
        return weLends;
    }
}
