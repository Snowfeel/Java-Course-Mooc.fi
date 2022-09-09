import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> list;

    public VehicleRegistry(){
        list =new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if (!list.containsKey(licensePlate)){
            list.put(licensePlate,owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if (list.containsKey(licensePlate)){
            return list.get(licensePlate);
        }
        return null;
    }
    public boolean remove(LicensePlate licensePlate){
        if (list.containsKey(licensePlate)){
            list.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for(LicensePlate i:list.keySet()){
            System.out.println(i);
        }
    }

    public void printOwners(){
        ArrayList<String> owner = new ArrayList<>();
        for(String i:list.values()){
            if (!owner.contains(i)) {
                System.out.println(i);
                owner.add(i);
            }
        }
    }
}
