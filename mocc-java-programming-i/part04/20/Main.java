import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.printf("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.printf("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.printf("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name,pages,year));
        }
        System.out.println("");
        System.out.printf("What information will be printed? ");
        String ask = scanner.nextLine();
        if(ask.equals("everything")){
            for (Book i: books){
                System.out.println(i);
            }
        } else if (ask.equals("name")) {
            for (Book i: books){
                System.out.println(i.getName());
            }
        }


    }
}
