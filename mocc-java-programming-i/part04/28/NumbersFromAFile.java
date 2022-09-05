
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int count = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        try (Scanner data = new Scanner(Paths.get(file))){
            while (data.hasNextLine()){
                list.add(data.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        for (String l:list){
            int i = Integer.valueOf(l);
            if (i >= lowerBound && i<= upperBound){
                count++;
            }
        }

        System.out.println("Numbers: "+count);
    }

}
