import java.time.LocalDate;

public  class Book {
    private int id;
    private String title;
    private Author author;
    private boolean available;
    private LocalDate registrationDate;
    private LocalDate updateDate;

    Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
        this.registrationDate = new Date();
        this.updateDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Date registrationDate() {
        return registrationDate;
    }

    public Date updateDate() {
        return updateDate;
    }

    public void setTitle(String title) {
        this.title = title;
        this.updateDate = new Date();

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
