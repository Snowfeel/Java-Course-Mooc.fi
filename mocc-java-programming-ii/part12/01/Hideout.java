import java.util.Scanner;

public class Hideout<T> {

    private T toHide;

    public void putIntoHideout(T toHide){
        this.toHide = toHide;
    }

    public T takeFromHideout(){
        T temp = toHide;
        toHide = null;
        return temp;
    }

    public boolean isInHideout(){
        if (toHide!=null){
            return true;
        }
        return false;
    }
}
