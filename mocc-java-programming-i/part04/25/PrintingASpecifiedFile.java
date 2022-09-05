
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String s = scanner.nextLine();
        try (Scanner file = new Scanner(Paths.get(s))){
            while (file.hasNextLine()){
                System.out.println(file.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
