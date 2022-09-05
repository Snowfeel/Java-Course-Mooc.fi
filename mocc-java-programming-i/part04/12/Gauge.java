public class Gauge {
    private int value;

    public Gauge(){
        this.value = 0;
    }

    public void increase(){
        if (this.value < 5){
            this.value++;
        }
    }

    public void decrease(){
        if (value>0) {
            value--;
        }
    }

    public int value(){
        return value;
    }

    public boolean full(){
        if(value == 5){
            return true;
        }else{
            return false;
        }
    }
}
