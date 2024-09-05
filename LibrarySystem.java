import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {
    
    public static void main(String[] args) {    

        List<String> objects = new ArrayList<>();

        objects.add("Java");
        objects.add("Spring");
        objects.add("MySQL");
        objects.add("Kafka");

        Scanner scanner = new Scanner(System.in);

        System.out.println("You want to see the available books?");

    while (scanner.nextLine().equals("yes")) {
            for(String object: objects) {
                System.out.println(object);
            }
        }
    }
}
