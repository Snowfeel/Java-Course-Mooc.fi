
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args){
        ArrayList<Recipe> recipes = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("File to read: ");

        try (Scanner scanner = new Scanner(Paths.get(inputScanner.nextLine()))) {
            int i = 0;
            int j= 0;
            String name = "";
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()){
                    i=0;
                    j++;
                }else {
                    if (i == 0) {
                        name = row;
                        i++;
                    } else if (i == 1) {
                        i++;
                        recipes.add(new Recipe(name, Integer.valueOf(row)));
                    } else {
                        recipes.get(j).addIngredient(row);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");
        while (true){
            System.out.print("Enter command: ");
            String input = inputScanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            switch (input) {
                case "list":
                    System.out.println("\nRecipes: ");
                    for (Recipe i : recipes) {
                        System.out.println(i);
                    }
                    System.out.println("");
                    break;
                case "find name": {
                    System.out.print("Searched word: ");
                    String s = inputScanner.nextLine();
                    System.out.println("\nRecipes: ");
                    for (Recipe i : recipes) {
                        if (i.searchRecipe(s)) {
                            System.out.println(i);
                        }
                    }
                    System.out.println("");
                    break;
                }
                case "find cooking time": {
                    System.out.print("Max cooking time: ");
                    int s = Integer.valueOf(inputScanner.nextLine());
                    System.out.println("\nRecipes: ");
                    for (Recipe i : recipes) {
                        if (i.searchTime(s)) {
                            System.out.println(i);
                        }
                    }
                    System.out.println("");
                    break;
                }
                case "find ingredient": {
                    System.out.print("Ingredient: ");
                    String s = inputScanner.nextLine();
                    System.out.println("\nRecipes: ");
                    for (Recipe i : recipes) {
                        if (i.searchIngredient(s)) {
                            System.out.println(i);
                        }
                    }
                    System.out.println("");
                    break;
                }
            }
        }
    }

}
