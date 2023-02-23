package Lesson18;

public class Test2 {
    public static void main(String[] args) {
        //Declaration
        int[] array1;
        String[] array2;
        double[][] array3;
        int array4[][];

        //Allocation
        array1 = new int[3];
        array2 = new String[3];
        array3 = new double[4][2]; // создано 4 массиво с 2 элементами каждый
        array4 = new int[4][]; // создано 4 массиво с разным количеством элементов


        System.out.println(array1.length);

        //Initialization
        //static
        array2[0] = "hello";
        array2[1] = "good bye";
        array2[2] = "ok";

        //dynamic
        String[] array10;
        int[][] array11;

        array10 = new String[3];
        array11 = new int[3][];

        for (int i = 0; i < array10.length; i++) {
            array10[i] = "hello" + i;
            System.out.println(array10[i]);
        }

        array11[0] = new int[5];
        array11[1] = new int[2];
        array11[2] = new int[7];

        for (int i = 0; i < array11.length; i++) {
            for (int j = 0; j < array11[i].length; j++) {
                array11[i][j] = i + j;
                System.out.print(array11[i][j]);
            }

        }

        //declaration and allocation together

        int[] array20 = new int[7];

        //declaration, allocation, initialization together
        int[] array30 = {1,2,3};

        int[] array40;
        array40 = new int[]{1,2,3};


    }
}
