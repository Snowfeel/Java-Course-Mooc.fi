import java.util.ArrayList;

public class Bird {
    private String name;
    private String latin;
    private int ob;

    public Bird(String name,String latin){
        this.name = name;
        this.latin = latin;
        ob = 0;
    }

    public String getName(){
        return name;
    }

    public void observation(){
        ob++;
    }

    public String toString(){
        return name+" ("+ latin +"): " + ob +" observations";
    }
}
