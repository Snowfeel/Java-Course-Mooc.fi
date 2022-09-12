import java.util.ArrayList;

public class MisplacingBox extends Box{

    private ArrayList<Item> box;

    public MisplacingBox(){
        box = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
            box.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
