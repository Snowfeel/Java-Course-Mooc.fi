import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Book> books;
    private Scanner scanner;

    public UserInterface(ArrayList<Book> books, Scanner scanner){

        this.books = books;
        this.scanner = scanner;
    }

    public void Start(){
        while (true){
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            System.out.println();
            books.add(new Book(name,age));
        }
        System.out.println();
        System.out.println(books.size() +  " books in total.\n");
        System.out.println("Books:");

        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(books,comparator);
        books.stream().forEach( b ->System.out.println(b));
    }

}
