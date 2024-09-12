import java.time.LocalDate;

public class Author {
    int id = 0;
    String name;
    LocalDate dateOfBirthDate;

    Author(int id, String name, LocalDate dateOfBirthDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirthDate = dateOfBirthDate;
    }

    @Override
    public String toString() {
        return "Author:" + name + "";
    }

}
