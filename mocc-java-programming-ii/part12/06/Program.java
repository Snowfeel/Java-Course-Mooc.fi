
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int n = Integer.valueOf(scanner.nextLine());
        Random s = new Random();
        for (int i = 0; i < n; i++) {
            int r = s.nextInt(11);
            System.out.println(r);

        }
    }


}
