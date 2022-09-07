import java.util.ArrayList;

public class Pipe <T>{

    private ArrayList<T> pipe;
    public Pipe(){
        pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        pipe.add(value);
    }

    public T takeFromPipe(){
        if (!isInPipe()){
            return null;
        }
        T temp = pipe.get(0);
        pipe.remove(0);
        return temp;
    }

    public boolean isInPipe(){
        if (pipe.size()==0){
            return false;
        }
        return true;
    }
}
