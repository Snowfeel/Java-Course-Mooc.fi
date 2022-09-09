import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translateList;

    public DictionaryOfManyTranslations(){
        translateList = new HashMap<>();
    }

    public void add(String word, String translation){
        translateList.putIfAbsent(word,new ArrayList<>());
        translateList.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        if (translateList.containsKey(word)){
            return translateList.getOrDefault(word,null);
        }
        return new ArrayList<>();
    }

    public void remove(String word){
        if (translateList.containsKey(word)){
            translateList.get(word).clear();
        }
    }
}
