
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number? ");
        int userStart = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int userEnd = Integer.valueOf(scanner.nextLine());
        for (int i = userStart ; i <= userEnd ; i++) {
            sum+=i;
        }
        System.out.println("The sum is "+ sum);

    }
}
