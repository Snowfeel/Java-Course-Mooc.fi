
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> list = new ArrayList<>();



    public void addToHerd(Movable movable){
        this.list.add(movable);
    }


    public String toString(){
        String s = "";
        for (Movable i:list){
            s += i +"\n";
        }
        return s;
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable i: list){
            i.move(dx,dy);
        }
    }
}
