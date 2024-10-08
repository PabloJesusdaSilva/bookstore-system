import java.util.Scanner;
import java.util.Date;
import java.util.List;

public class LibrarySystem {
    
    public static void main(String[] args) {    
        Bookstore bookstore = new Bookstore();
        Scanner scanner = new Scanner(System.in);

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

        while(true) {
            System.out.println("Do you want to borrow a book? (yes/no)");
            String response = scanner.nextLine().toLowerCase();

            if(response.equals("yes")) {
                List<Book> availableBooks = bookstore.listAvailableBooks();

                if(availableBooks.isEmpty()) {
                    System.out.println("Not have available books");
                } else {
                    System.out.println("Available books:");

                    for(Book book: availableBooks) {
                        System.out.println(book.getId() + ": " + book.getTitle());
                    }

                    System.out.println("Enter the ID of the book you wish to borrow: ");
                    int idBook = scanner.nextInt();
                    scanner.nextLine();

                    Book selectedBook = bookstore.getBookForId(idBook);

                    if(selectedBook != null && selectedBook.isAvailable()) {
                        System.out.println("Enter your name: ");
                        String username = scanner.nextLine();

                        bookstore.lendBook(selectedBook, username);
                        System.out.println("The book " + selectedBook.getTitle() + " was loaned to " + username);
                    } else {
                        System.out.println("Book not found or not available for loan.");
                    }
                }              
            } else if(response.equals("no")) {
                System.out.println("Thank you for using the library system.");
            } else {
                System.out.println("Invalid response. Please respond with 'yes' or 'no'.");
            }

        }
    
    }
}
