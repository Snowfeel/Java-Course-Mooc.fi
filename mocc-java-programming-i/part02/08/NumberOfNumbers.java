
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (true){
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }
            sum++;
        }

        System.out.println("Number of numbers: " + sum);
    }
}
