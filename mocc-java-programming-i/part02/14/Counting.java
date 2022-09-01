
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int userInput = Integer.valueOf(scanner.nextLine());
        for ( i = 0 ; i < userInput+1 ; i++){
            System.out.println(i);
        }
    }
}
