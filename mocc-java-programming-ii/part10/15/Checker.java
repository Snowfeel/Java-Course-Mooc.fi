

public class Checker {

    private String input;


    public boolean isDayOfWeek(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
    }

    public boolean allVowels(String string){
        if (string.matches("(a|e|i|o|u)*")){
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string){
        if (string.matches("[0-6][0-9]:[0-5][0-9]:[0-5][0-9]")){
            String[] parts = string.split(":");
            if (Integer.valueOf(parts[0]) < 24) {
                return true;
            }
        }
        return false;
    }
}
