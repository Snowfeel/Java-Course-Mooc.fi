import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> box;

    public OneItemBox(){
        box = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (box.isEmpty()){
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (box.contains(item)){
            return true;
        }
        return false;
    }
}
