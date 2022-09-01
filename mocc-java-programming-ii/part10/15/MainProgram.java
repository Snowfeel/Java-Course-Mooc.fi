import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Scanner scanner = new Scanner(System.in);
        Checker c = new Checker();
        System.out.print("Enter a string: ");
        //String s = scanner.nextLine();
        String s = "05:60:00";
        if (c.timeOfDay(s)){
            System.out.println("The form is correct.");
        }else {
            System.out.println("The form is incorrect.");
        }

    }
}
