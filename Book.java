import java.time.LocalDate;

public  class Book {
    int id = 0;
    String title;
    Author author;
    Boolean availability;
    LocalDate registrationDate;
    LocalDate updateDate;

    Book(){}

    Book(int id, String title, Author author, Boolean availability, LocalDate registrationDate, LocalDate updateDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availability = availability;
        this.registrationDate = registrationDate;
        this.updateDate = updateDate;
    }


    @Override
    public String toString() {
        return "\nBook: " + id + "\ntitle: " + title + "\nAuthor: " + author + 
               "\nisAvailable: " + availability + "\npublicationDate: " + registrationDate + 
               "\nreturnDate: " + updateDate + "\n";
    }
}
