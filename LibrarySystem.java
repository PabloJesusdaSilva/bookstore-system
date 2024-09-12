import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    
    public static void main(String[] args) {    
        Library books = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.print("You want to see the available books?");

    while (scanner.nextLine().equals("yes")) {
            for(Book book: books.getBooks()) {
                System.out.println(book);
            }
            books.getBooks();

            System.out.println("Enter the id of the book: ");
            String bookId = scanner.nextLine();

            System.out.println("Enter the name of the book: ");
            String bookName = scanner.nextLine();
        }
    }
}
