import java.util.Scanner;

public class LibrarySystem {
    
    public static void main(String[] args) {    
        Library books = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.print("You want to see the available books? ");

        while (scanner.nextLine().equals("yes")) {
            for(Book book: books.getBooks()) {
                if(book.available == true) {
                    System.out.println(book);
                }    
            }

            System.out.println("Whats your name? ");
            String clientName = scanner.nextLine();

            System.out.println("\nEnter the name of the book: ");
            String bookName = scanner.nextLine();
                
            System.out.println("\nEnter the id of the book: ");
            int bookId = scanner.nextInt();
                
            books.lendingBook(bookId, true);
            
            System.out.println("Hello " + clientName + "\nCongratulations, the book " + bookName + " was successfully borrowed!");
        }

        System.out.println("Bye, see you next time");
    }
}
