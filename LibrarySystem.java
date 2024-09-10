import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    
    public static void main(String[] args) {    

        List<Book> books = new ArrayList<>();

        Book bookOne = new Book(1, "Jack Sparow", new Author(1, "Fulano", LocalDate.of(1982, 5, 29)), false, LocalDate.of(2023, 4, 24), LocalDate.of(2024, 4, 24));

        Book bookTwo = new Book(2, "O Pequeno Principe", new Author(2, "Ciclano", LocalDate.of(1953, 9, 2)), true, LocalDate.of(2024, 4, 2), LocalDate.of(2024, 9, 17));

        books.add(bookOne);
        books.add(bookTwo);

        Scanner scanner = new Scanner(System.in);

        System.out.println("You want to see the available books?");

    while (scanner.nextLine().equals("yes")) {
            for(Book book: books) {
                System.out.println(book);
            }
        }
    }
}
