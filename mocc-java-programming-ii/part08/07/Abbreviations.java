import java.util.HashMap;

public class Abbreviations {

    private HashMap<String,String> abbre;

    public Abbreviations(){
        abbre = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbre.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return abbre.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return abbre.get(abbreviation);
    }
}
