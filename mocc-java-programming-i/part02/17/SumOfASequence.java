
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Last number? ");
        int userInput = Integer.valueOf(scanner.nextLine());
        int sum = 0 ;
        while (userInput != 0 ){
            sum+=userInput;
            userInput--;
        }
        System.out.println("The sum is "+sum);
    }
}
