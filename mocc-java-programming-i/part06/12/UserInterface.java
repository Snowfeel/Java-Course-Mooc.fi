import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokes;
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start(){
        while (true) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");
            String input = scanner.nextLine();
            if (input.equals("X")){
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                jokes.addJoke(scanner.nextLine());
            } else if (input.equals("2")) {
                System.out.println(jokes.drawJoke());
            } else if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                jokes.printJokes();
            }
        }
    }
}
