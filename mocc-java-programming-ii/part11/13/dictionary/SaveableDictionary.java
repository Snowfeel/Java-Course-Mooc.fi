package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String,String> words;
    private String file;
    public SaveableDictionary(String file){
        words = new HashMap<>();
        this.file = file;
    }

    public SaveableDictionary(){
        words = new HashMap<>();
    }

    public void add(String words, String translation){
        this.words.putIfAbsent(words, translation);
        this.words.putIfAbsent(translation,words);
    }

    public String translate(String word){
       return words.getOrDefault(word,null);
    }
    public void delete(String word){
        String translation = words.get(word);
        words.remove(word);
        words.remove(translation);
    }

    public boolean load(){
        try {
            Scanner scanner = new Scanner(Paths.get(file));
            while (scanner.hasNextLine()){
                String reader = scanner.nextLine();
                String[] part = reader.split(":");
                //System.out.println(part[0]);
                //System.out.println(part[1]);
                words.putIfAbsent(part[0],part[1]);
                words.putIfAbsent(part[1],part[0]);
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean save()  {
        try {
            PrintWriter writer = new PrintWriter(file);
            HashMap<String,String> alreadyAdd = new HashMap<>();
            for (String i:words.keySet()){
                if (!alreadyAdd.containsValue(i)) {
                    writer.println(i + ":" + words.get(i));
                    alreadyAdd.put(i,words.get(i));
                    System.out.println("Successfully wrote to the file." + i +":" +  words.get(i));
                }

            }
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }

    }
}
