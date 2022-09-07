import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int weight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.weight = 0;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (weight+suitcase.totalWeight() <= maxWeight ){
            suitcases.add(suitcase);
            weight+= suitcase.totalWeight();
        }
    }
    public String toString(){
        if (suitcases.size() == 0 ){
            return "no suitcase (0 kg)";
        }

        if (suitcases.size() == 1){
            return "1 suitcases (" + weight +" kg)";
        }

        return suitcases.size() + " suitcases (" + weight +" kg)";
    }

    public void printItems(){
        for(Suitcase i:suitcases){
            i.printItems();
        }
    }
}
