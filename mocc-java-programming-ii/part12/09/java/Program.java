
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
                {3},
                {2, 4},
                {3, 2, 1},
                {4,4,4,4}
        };

        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array){
        String output = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                output += array[i][j];
            }
            output += "\n";
        }

        return output;
    }

}
