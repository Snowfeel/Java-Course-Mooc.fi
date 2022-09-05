
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int win = 0;
        int lose = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList<Games> game = new ArrayList<>();
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try(Scanner data = new Scanner(Paths.get(file))){
            while (data.hasNextLine()){
                String[] line = data.nextLine().split(",");
                game.add(new Games(line[0] , line[1] , Integer.valueOf(line[2]),Integer.valueOf(line[3])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Games g:game){
            if (g.getWin(team)){
                win++;
            }
            if (g.getLose(team)){
                lose++;
            }
        }
        int gameCount= win+lose;
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);

    }

}
