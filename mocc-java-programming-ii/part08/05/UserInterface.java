import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.printf("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            if (input.equals("add")){
                System.out.printf("To add: ");
                String s = scanner.nextLine();
                list.add(s);
            }else if (input.equals("list")){
                list.print();
            } else if (input.equals("remove")) {
                System.out.printf("Which one is removed? ");
                int n = Integer.valueOf(scanner.nextLine());
                list.remove(n);
            }
        }
    }

}
