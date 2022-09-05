
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean hasFile = true;
        boolean hasName = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner data = new Scanner(Paths.get(file))){
            while (data.hasNextLine()){
                list.add(data.nextLine());
            }
        } catch (IOException e) {
            hasFile = false;
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (hasFile){
            for (String l:list){
                if (l.equals(searchedFor)){
                    hasName=true;
                }
            }
            if (hasName){
                System.out.println("Found!");
            }else {
                System.out.println("Not found.");
            }
        } else {
            System.out.println("Reading the file "+ file +" failed.");
        }


    }
}
