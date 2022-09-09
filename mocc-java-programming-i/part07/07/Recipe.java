import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredient;

    public Recipe(String name,int time){
        this.name = name;
        this.time = time;
        ingredient = new ArrayList<>();
    }

    public void addIngredient(String ingredient){
        this.ingredient.add(ingredient);
    }

    public boolean searchIngredient(String search){
        if (ingredient.contains(search)){return true;}
        return false;
    }

    public boolean searchRecipe(String search){
        if (name.contains(search)){return true ;}
        return false;
    }

    public boolean searchTime(int search){
        if( time <= search ){return true;}
        return false;
    }

    public String toString(){
        return name + ", cooking time: " +time;
    }
}
