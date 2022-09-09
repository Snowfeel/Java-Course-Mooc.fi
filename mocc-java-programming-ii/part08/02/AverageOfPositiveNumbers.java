
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            int s = Integer.valueOf(scanner.nextLine());
            if (s== 0 ){
                break;
            }
            if (s>0) {
                sum += s;
                count++;
            }
        }
        if (sum <= 0){
            System.out.println("Cannot calculate the average");
        }else {
            System.out.println((double) sum/count);
        }

    }
}
