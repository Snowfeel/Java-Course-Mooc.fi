
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Where to? ");
        int userInputEnd = Integer.valueOf(scanner.nextLine());
        System.out.printf("Where from? ");
        int userInputStart = Integer.valueOf(scanner.nextLine());
        for (int i = userInputStart ; i <= userInputEnd ; i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
