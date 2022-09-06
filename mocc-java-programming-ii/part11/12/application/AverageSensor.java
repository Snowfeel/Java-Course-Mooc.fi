package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor{

    private List<Sensor> sensors;
    private List<Integer> n = new ArrayList<>();

    public AverageSensor(){
        sensors = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public List<Integer> readings(){
        return n;
    }
    @Override
    public boolean isOn() {
        return sensors.get(0).isOn();
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(i -> i.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(i -> i.setOff());
    }

    @Override
    public int read() {
        int avg = 0;
        for (Sensor i:sensors){
            if (i.isOn()== true){
                int x =i.read();
                avg += x;
            }
        }
        n.add(avg/sensors.size());
        return avg/sensors.size();
    }
}
