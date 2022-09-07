import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list,Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){

        while(true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            if(input.equals("add")) {
                System.out.print("To add: ");
                input = scanner.nextLine();
                list.add(input);
            } else if (input.equals("list")) {
                list.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                list.remove(index);
            }
        }
    }
}
