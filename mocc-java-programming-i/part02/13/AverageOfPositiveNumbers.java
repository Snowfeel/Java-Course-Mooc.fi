
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0){
                break;
            }else if (userInput > 0){
                sum+= userInput;
                num++;
            }
        }
        if (num ==0) {
            System.out.println("Cannot calculate the average");
        }else {
            System.out.println((double)sum/num);
        }
    }
}
