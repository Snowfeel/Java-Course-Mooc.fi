import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;
    public ChangeHistory(){
        list = new ArrayList<>();
    }

    public void add(double status){
        list.add(status);
    }

    public void clear(){
        list.clear();
    }

    public double maxValue(){
        double max = 0;
        for (Double i:list){
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    public double minValue(){
        double min = 99999;
        for (Double i:list){
            if (i<min){
                min = i;
            }
        }
        return min;
    }

    public double average(){
        double sum = 0;
        for (Double i:list){
            sum += i;
        }
        return sum/list.size();
    }

    public String toString(){
        return list.toString();
    }
}
