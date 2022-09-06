package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean status;

    public TemperatureSensor(){
        setOff();

    }
    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if (!status){
            throw new IllegalArgumentException();
        }
        int s = new Random().nextInt(61);
        return s-30;
    }
}
