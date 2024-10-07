import java.time.LocalDate;

public class Author {
    int id;
    String name;
    LocalDate dateOfBirthDate;

    Author(int id, String name, LocalDate dateOfBirthDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirthDate = new Date();
    }

    public int getId() {
        return id
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirthDate() {
        return dateOfBirthDate;
    }

    public String setName(String name) {
        this.name = name;
    }

    public Date setDateOfBirthDate(Date dateOfBirthDate) {
        this.dateOfBirthDate = dateOfBirthDate;    
    }  
    
    @Override
    public String toString() {
        return "Author:" + name + "";
    }

}
