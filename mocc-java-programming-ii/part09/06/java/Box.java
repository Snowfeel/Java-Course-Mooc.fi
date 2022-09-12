import java.util.ArrayList;

public class Box implements Packable{
    private double maxWeight;
    private double weight;
    private ArrayList<Packable> list;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.weight = 0;
        this.list = new ArrayList<>();
    }

    public void add(Packable packable){
        if (packable.weight() + weight <= maxWeight ){
            weight += packable.weight();
            list.add(packable);
        }
    }

    @Override
    public double weight() {
        weight = 0;
        for (Packable i:list){
            weight += i.weight();
        }
        return weight;
    }

    public String toString(){
        return "Box: " + list.size() + " items, total weight " + this.weight + " kg";
    }
}
