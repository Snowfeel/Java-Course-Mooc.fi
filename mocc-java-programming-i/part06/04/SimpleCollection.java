
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String s = "The collection " + name + " ";
        String e = "";

        if(elements.isEmpty()){
            return s + "is empty.";
        }

        for (String i: elements){
            e += "\n" + i ;
        }
        if (elements.size()== 1){
            return s + "has " + elements.size() + " element:" + e;
        }

        return s + "has " + elements.size() + " elements:" + e;
    }
    
}
