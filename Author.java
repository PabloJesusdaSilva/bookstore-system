import java.util.Date;

public class Author {
    int id;
    String name;
    Date dateOfBirthDate;

    Author(int id, String name, Date dateOfBirthDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirthDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirthDate() {
        return dateOfBirthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirthDate(Date dateOfBirthDate) {
        this.dateOfBirthDate = dateOfBirthDate;    
    }  
    
    @Override
    public String toString() {
        return "Author:" + name + "";
    }

}
