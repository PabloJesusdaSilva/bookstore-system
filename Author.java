import java.time.LocalDate;

public class Author {
    private int id = 0;
    private String name;
    private LocalDate dateOfBirthDate;

    Author(int id, String name, LocalDate dateOfBirthDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirthDate = dateOfBirthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author:" + name + "";
    }

}
