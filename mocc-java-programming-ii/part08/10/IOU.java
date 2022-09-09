import java.util.HashMap;

public class IOU {

    private HashMap<String,Double> iOwnU;
    public IOU(){
        iOwnU = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        iOwnU.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        return iOwnU.getOrDefault(toWhom,0.0);
    }

}
