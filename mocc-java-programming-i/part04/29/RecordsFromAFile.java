
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner data = new Scanner(Paths.get(file))){
            while (data.hasNextLine()){
                String line = data.nextLine();
                String[] part = line.split(",");
                System.out.println(part[0] + " ,ages: "+ part[1] + " years");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
