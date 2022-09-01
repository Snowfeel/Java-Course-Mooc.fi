import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> list;

    public Employees (){
        list = new ArrayList<>();
    }

    public void add(Person personToAdd){
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        list.addAll(peopleToAdd);
    }

    public void print(){
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person s = iterator.next();
            if (s.getEducation() == education) {
                System.out.println(s);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person s = iterator.next();
            if (s.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
