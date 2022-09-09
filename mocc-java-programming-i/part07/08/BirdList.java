import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> list;

    public BirdList(){
        list = new ArrayList<>();
    }

    public void add(String name,String latin){
        list.add(new Bird(name, latin));
    }

    public boolean observe(String name){
        for (Bird i:list){
            if (i.getName().equals(name)){
                i.observation();
                return true;
            }
        }
        return false;
    }

    public void printAll(){
        for (Bird i:list){
            System.out.println(i);
        }
    }

    public void print(String search){
        for (Bird i:list){
            if (i.getName().equals(search)){
                System.out.println(i);
            }
        }
    }
}
