import java.util.Date;

public class WeLend {
    private int id;
    private static int contadorId = 1;
    private Book book;
    private String username;
    private Date weLendDate;
    private Date returnDate;
    private boolean active;


    WeLend(Book book, String username) {
        this.id = contadorId++;
        this.book = book;
        this.username = username;
        this.weLendDate = new Date();
        this.active = true;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public String getUsername() {
        return username;
    }

    public Date getWeLendDate() {
        return weLendDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public boolean isActive() {
        return active;
    }

    public void returnBook() {
        this.returnDate = new Date();
        this.active= false;
        this.book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", livro=" + book +
                ", nomeUsuario='" + username + '\'' +
                ", dataEmprestimo=" + weLendDate +
                ", dataDevolucao=" + returnDate +
                ", ativo=" + active +
                '}';
    }
}
