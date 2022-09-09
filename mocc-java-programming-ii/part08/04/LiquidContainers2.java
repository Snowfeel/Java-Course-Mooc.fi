
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")){
                first.add(amount);
            }else if (parts[0].equals("move")){
                if (first.contains() >= amount) {
                    first.remove(amount);
                    second.add(amount);
                }else {
                    second.add(first.contains());
                    first.remove(amount);
                }
            }else if (parts[0].equals("remove")){
                second.remove(amount);
            }

        }
    }

}
