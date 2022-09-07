import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private int weight;
    private ArrayList<Item> items;


    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
        weight = 0;
    }

    public void addItem(Item item){
        if (weight+item.getWeight() <= maxWeight){
            items.add(item);
            weight+= item.getWeight();
        }
    }

    public Item heaviestItem(){
        Item heaviest = new Item("",0);
        if (items.size() == 0 ){
            return null;
        }
        for (Item i: items){
            if (heaviest.getWeight() < i.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }

    public String toString(){
        if (items.size() == 0 ){
            return "no items (0 kg)";
        }

        if (items.size() == 1){
            return "1 item (" + weight +" kg)";
        }

        return items.size() + " items (" + weight +" kg)";
    }

    public void printItems(){
        for (Item i:items){
            System.out.println(i);
        }
    }

    public int totalWeight(){
        return weight;
    }
}
