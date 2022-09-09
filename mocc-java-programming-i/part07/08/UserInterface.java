import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdList list;

    public UserInterface(BirdList list,Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }

    public void start(){
        while (true){
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit")){
                break;
            }

            if (input.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();
                list.add(name,latin);
            } else if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                if (!(list.observe(name))){
                    System.out.println("Not a bird!");
                }
            } else if (input.equals("All")) {
                list.printAll();
            } else if (input.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                list.print(name);
            }

        }
    }
}
