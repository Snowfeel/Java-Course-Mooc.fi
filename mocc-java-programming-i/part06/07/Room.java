import java.util.ArrayList;

public class Room {

    private ArrayList<Person> person;

    public Room(){
        person = new ArrayList<>();
    }

    public void add(Person person){
        this.person.add(person);
    }

    public boolean isEmpty(){
        if (person.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return person;
    }

    public Person shortest(){
        Person s = new Person("s",999);

       if (person.isEmpty()){
           return null;
       }

        for (Person i:person){
            if(s.getHeight() > i.getHeight()){
                s = i;
            }
        }

        return s;
    }

    public Person take(){
        Person s;
        s = this.shortest();
        person.remove(s);
        return s;
    }
}
