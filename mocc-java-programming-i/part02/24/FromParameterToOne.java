import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(userInput);

    }

    public static void printFromNumberToOne(int num){
        for (int i = num ; i > 0 ; i--){
            System.out.println(i);
        }
    }
}
