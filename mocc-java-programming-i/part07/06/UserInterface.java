import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Score scores;

    public UserInterface(Score scores,Scanner scanner){
        this.scores = scores;
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            String input = scanner.nextLine();
            if (input.equals("-1")){
                break;
            }
            scores.add(Integer.valueOf(input));
        }
        System.out.println("Point average (all): " + scores.average());
        System.out.println("Point average (passing): " + scores.averagePassing());
        System.out.println("Pass percentage: " + scores.passPercent());
        System.out.println("Grade distribution: ");
        scores.printStar();
    }
}
