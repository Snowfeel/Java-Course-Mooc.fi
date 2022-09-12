
public class Main {

    public static void main(String[] args) {
        // test your classes here
            Box box =new Box(10);
            Box bigBox = new Box(20);
            bigBox.add(box);
            box.add(new Book("a","b",5));

            System.out.println(bigBox.weight());
    }

}
