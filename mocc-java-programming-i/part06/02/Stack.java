import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack(){
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
            stack.add(value);
    }

    public ArrayList<String> values(){
        return stack;
    }

    public String take(){
        String s = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return s;

    }
}
