import java.lang.reflect.Array;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        /*int[] array = {3, 1, 5, 99, 3, 12};*/
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
            int small = 99999;
            for (int i : array) {
                if (small > i) {
                    small = i;
                }
            }
            return small;
    }
    public static int indexOfSmallest(int[] array){
        // write your code here
        int small = 99999;
        int index = 0;
        for (int i =0; i < array.length ;i++) {
            if (small > array[i]) {
                small = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // write your code here
        int small = 99999;
        int index = 0;
        for (int i =startIndex; i < array.length ;i++) {
            if (small > array[i]) {
                small = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int index = indexOfSmallestFrom(array,i);
            temp = array[i] ;
            array[i] = array[index];
            array[index] = temp;
        }
    }

}
