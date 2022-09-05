
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.printf("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()){
                break;
            }
            System.out.printf("Last name: ");
            String lastName = scanner.nextLine();
            System.out.printf("Identification number: ");
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName,lastName,id));
        }
        System.out.println("");
        for (PersonalInformation i: infoCollection){
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }

    }
}
