import java.util.Scanner;
import java.util.Date;
import java.util.List;

public class LibrarySystem {
    public static final String WELCOME_MESSAGE = "Do you want to borrow a book? (yes/no)";
    public static final String TANK_YOU_MESSAGE = "Thank you for using the library system.";
    public static final String INVALID_RESPONSE_MESSAGE = "Invalid response. Please respond with 'yes' or 'no'.";

    public static void main(String[] args) {    
        Bookstore bookstore = new Bookstore();
        Scanner scanner = new Scanner(System.in);

        setupLibrary(bookstore);

        while(true) {
            System.out.println(WELCOME_MESSAGE);
            String response = scanner.nextLine().trim().toLowerCase();

            switch (response) {
                case "yes":
                    handleBookBorrowing(bookstore, scanner);
                    break;
                case "no":
                    System.out.println(TANK_YOU_MESSAGE);
                    return;
                default:
                    System.out.println(INVALID_RESPONSE_MESSAGE);
                    break;
            }
        }
    }

    private static void setupLibrary(Bookstore bookstore) {
        Author author1 = new Author(1, "J.K. Rowling", new Date());
        Author author2 = new Author(2, "J.R.R. Tolkien", new Date());

        bookstore.addAuthors(author1);
        bookstore.addAuthors(author2);

        Book book1 = new Book(1, "Harry Potter e a Pedra Filosofal", author1);
        Book book2 = new Book(2, "O Senhor dos Anéis: A Sociedade do Anel", author2);
        Book book3 = new Book(3, "Harry Potter e a Câmara Secreta", author1);

        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);
    }

    private static void handleBookBorrowing(Bookstore bookstore, Scanner scanner) {
        List<Book> availableBooks = bookstore.listAvailableBooks();

        if(availableBooks.isEmpty()) {
            System.out.println("Not have available books");
        } else {
            displayAvailableBooks(availableBooks);
            borrowBook(bookstore, scanner);
        }
    }

    private static void displayAvailableBooks(List<Book> availableBooks) {
        System.out.println("Available books:");

        for(Book book: availableBooks) {
            System.out.println(book.getId() + ": " + book.getTitle());
        }
    }

    private static void borrowBook(Bookstore bookstore, Scanner scanner) {
        System.out.println("Enter the ID of the book you wish to borrow: ");
        int idBook = Integer.parseInt(scanner.nextLine());
        Book selectedBook = bookstore.getBookForId(idBook);

        if(selectedBook != null && selectedBook.isAvailable()) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();

            bookstore.lendBook(selectedBook, username);
            
            System.out.println("The book " + selectedBook.getTitle() + " was loaned to " + username);
        } else {
            System.out.println("Book not found or not available for loan.");
        }
    }
}
