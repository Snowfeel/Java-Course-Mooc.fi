public class Container {

    private int contain;

    public Container(){
        contain = 0;
    }

    public int contains(){
        return contain;
    }

    public void add(int amount){
        if (amount + contain >= 100){
            contain = 100;
        }else if (amount > 0){
            contain += amount;
        }
    }

    public void remove(int amount){
        if (amount > contain){
            contain = 0;
        }else if (amount > 0){
            contain -= amount;
        }
    }

    public String toString(){
        return contain +"/100";
    }
}
