package VarargsLesson19;

public class Test8 {
    public static void main(String[] args) {
        int [] array1 = {3,1,-2,0};
        int [] array2 = {-9, 1,5,2};

        for (int i = 0; i < array1.length && i < array2.length; i++){
            array1[i] = 1;
            array2[i] = 2;
        }

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);

        }
        System.out.println();

        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i]);

        }
    }
}
