package Lesson18;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[]array = {1, 9, 3, -8, 0, 5, 4, 1};

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
