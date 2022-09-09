import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageList;

    public StorageFacility(){
        storageList = new HashMap<>();
    }

    public void add(String unit, String item){
        storageList.putIfAbsent(unit,new ArrayList<>());
        storageList.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if (storageList.containsKey(storageUnit)){
            return storageList.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item){
        if (storageList.containsKey(storageUnit)){
                storageList.get(storageUnit).remove(item);

            if (storageList.get(storageUnit).size() == 0){
                storageList.remove(storageUnit);
            }
        }

    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> sList =new ArrayList<>();
        for (String s:storageList.keySet()){
            sList.add(s);
        }
        return sList;
    }
}
