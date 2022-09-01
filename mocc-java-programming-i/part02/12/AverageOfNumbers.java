
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (true){
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0){
                break;
            }
            num++;
            sum += userInput;
        }
        System.out.println("Average of the numbers: " + ((double)sum/num));

    }
}
