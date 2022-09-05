import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String program = scanner.nextLine();
            if (program.isEmpty()){
                break;
            }
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(program,duration));
        }
        System.out.println("");
        System.out.printf("Program's maximum duration? ");
        int ask = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram i: programs){
            if (i.getDuration() <= ask){
                System.out.println(i);
            }
        }

    }
}
