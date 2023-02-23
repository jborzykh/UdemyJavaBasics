package Lesson18;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[]array = {1, 9, 3, -8, 0, 5, 4, 1};

        //sort

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        //binarySearch
        System.out.println();
        int index1 = Arrays.binarySearch(array, -8);
        System.out.println(index1);
        int index2 = Arrays.binarySearch(array, 5);
        System.out.println(index2);
        int index3 = Arrays.binarySearch(array, 10);
        System.out.println(index3);
    }
}
