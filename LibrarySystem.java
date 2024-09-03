import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Author> authors = new ArrayList<>();

        authors.add(new Author(1, "Karen", LocalDate.of(2005, 2, 28)));

        books.add(new Book(
            1, 
            "Pablo", 
                new Author(2,
                "Pablo", 
                LocalDate.of(2004, 9, 30)), 
            true, 
            LocalDate.of(2023, 8, 30), 
            LocalDate.of(2024, 8, 20)));
       
        
        for(Book book: books) {
            Book.class.getName();
            System.out.println(book);
        }

        for(Author author: authors) {
            System.out.println(author);
        }

    }
}
