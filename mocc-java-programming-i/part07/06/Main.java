
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Score scores =new Score();
        UserInterface ui = new UserInterface(scores,scanner);

        ui.start();


    }
}
