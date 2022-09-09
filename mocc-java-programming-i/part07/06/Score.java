import java.util.ArrayList;

public class Score {
    private ArrayList<Integer> scores;

    public Score(){
        scores = new ArrayList<>();
    }

    public void add (int score){
        if ( score >= 0 && score <= 100){scores.add(score);}
    }

    public double average (){
        int sum = 0;
        for (Integer i:scores){
            sum += i;
        }
        return (double) sum/scores.size();
    }

    public String averagePassing(){
        int sum = 0;
        int pass = 0;
        for (Integer i:scores){
            if (i >= 50 ){
                sum += i;
                pass++;
            }
        }
        if (pass > 0){
            return String.valueOf((double) sum/pass);
        }

        return "-";
    }

    public double passPercent(){
        int pass = 0;
        for (Integer i:scores){
            if (i >= 50 ){
                pass++;
            }
        }
        return (double) pass/scores.size()*100;
    }

    public void printStar(){
        int[] grade = {0, 0, 0, 0, 0, 0};
        for(Integer i:scores){
            if (i < 50){
                grade[0]++;
            } else if (i<60) {
                grade[1]++;
            } else if (i<70) {
                grade[2]++;
            } else if (i<80) {
                grade[3]++;
            } else if (i<90) {
                grade[4]++;
            }else {
                grade[5]++;
            }
        }

        for (int i = grade.length-1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grade[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
}
