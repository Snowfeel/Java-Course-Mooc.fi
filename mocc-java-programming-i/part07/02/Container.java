public class Container {
    private int bag;

    public Container (){
        bag = 0;
    }

    public int contains(){return bag;}

    public void add(int amount){
        if (amount > 0){
            bag += amount;
            if (bag > 100){
                bag = 100;
            }
        }
    }

    public void remove(int amount){
        if (amount > bag){
            bag = 0;
        }else {
            bag -= amount;
        }
    }
    public String toString(){
        return bag+"/100";
    }
}
