public class Dog extends Animal implements NoiseCapable{

    private String name;
    public Dog(String name) {
        super(name);
        this.name = name;
    }

    public Dog (){
        super("Dog");
        this.name = super.getName();
    }

    public void bark (){
        System.out.println(name + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }

}
