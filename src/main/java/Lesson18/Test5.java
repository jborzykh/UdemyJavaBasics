package Lesson18;

public class Test5 {
    public static void main(String[] args) {
        int[]array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[]array2 = {1, 9, 3, -8, 0, 5, 4, 1};

        System.out.println(array1 == array2); //false

        int[]array3 = array2;
        System.out.println(array2 == array3); //true

        System.out.println(array2.equals(array3)); //true
        System.out.println(array1.equals(array2)); //false
    }
}
