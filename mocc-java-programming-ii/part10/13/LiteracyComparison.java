
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("literacy.csv"))) {
            while (scanner.hasNextLine()) {
                list.add(new Person(scanner.nextLine()));
            }
        }catch(IOException e){
                throw new RuntimeException(e);
            }
        list.stream().sorted((p1,p2) -> {return p1.compareTo(p2);}).forEach(p-> System.out.println(p));

    }

}