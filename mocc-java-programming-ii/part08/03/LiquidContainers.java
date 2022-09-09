
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {

            System.out.printf("First: %d/100\n" +
                    "Second: %d/100\n",first,second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")){
                if (amount > 100 || first+amount > 100 ){
                    first = 100;
                }else if (amount > 0){
                    first += amount;
                }
            }else if (parts[0].equals("move")){
                if (amount + second <= 100) {
                    if (amount > first) {
                        second += first;
                        first = 0;
                    } else if (amount > 0) {
                        first -= amount;
                        second += amount;
                    }
                }else {
                    if (amount > first) {
                        second = 100;
                        first = 0;
                    } else if (amount > 0) {
                        first -= amount;
                        second = 100;
                    }
                }
            }else if (parts[0].equals("remove")){
                if (amount > second){
                    second = 0;
                }else if(amount > 0){
                    second -= amount;
                }
            }

        }
    }

}
