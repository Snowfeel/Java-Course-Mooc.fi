import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner,SimpleDictionary dictionary){
        this.scanner = scanner;
        this.simpleDictionary = dictionary;
    }

    public void start(){
        String input;
        while (true){
            System.out.print("Command: ");
            input = scanner.nextLine();
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                String word;
                String translate;
                System.out.print("Word: ");
                word = scanner.nextLine();
                System.out.print("Translation: ");
                translate = scanner.nextLine();
                simpleDictionary.add(word,translate);
            } else if (input.equals("search")) {
                String word;
                System.out.print("To be translated: ");
                word = scanner.nextLine();
                if(simpleDictionary.translate(word) == null){
                    System.out.println("Word " + word + " was not found");
                }else {
                    System.out.println("Translation: " + simpleDictionary.translate(word));
                }
            } else {System.out.println("Unknown command");}

        }
    }
}
