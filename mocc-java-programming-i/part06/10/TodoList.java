import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }

    public void add(String task){
        tasks.add(task);
    }

    public void print(){
        int i = 1;
        for (String t:tasks){
            System.out.println(i + ": " + t);
            i++;
        }
    }

    public void remove(int number){
        tasks.remove(number-1);
    }
}
