import java.time.LocalDate;

public  class Book {
    int id = 0;
    String title;
    Author author;
    boolean available;
    LocalDate registrationDate;
    LocalDate updateDate;

    Book(){}

    Book(int id, String title, Author author, boolean available, LocalDate registrationDate, LocalDate updateDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.registrationDate = registrationDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "\nBook: " + id + "\ntitle: " + title + "\nAuthor: " + author + 
               "\nisAvailable: " + available + "\npublicationDate: " + registrationDate + 
               "\nreturnDate: " + updateDate + "\n";
    }
}
