import java.lang.annotation.Inherited;

public class Cat extends Animal implements NoiseCapable{
    private String name;
    public Cat(String name) {
        super(name);
        this.name = super.getName();
    }
    public Cat (){
        super("Cat");
        this.name =  super.getName();
    }

    public void purr (){
        System.out.println(name + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
}
