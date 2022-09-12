public class Book implements Packable{
    private String name;
    private String author;
    private double weight;

    public Book(String author,String name,double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return author + ": " + name;
    }
}
