package VarargsLesson19;

public class Test6 {
    public static void main(String[] args) {
        int[] array = {1,3,5,7};

//        for (int i = 0; i < array.length; i++){
//            array[i] = 3;
//        }

        System.out.println();

        for (int a : array){
            a = 3;

        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);

        }
        System.out.println();

        String [] array1 = {"one", "two", "three"};
        for (String s : array1){
            s  = new String("hello");
        }

        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        System.out.println();

        StringBuilder sb1 = new StringBuilder("one");
        StringBuilder sb2 = new StringBuilder("two");
        StringBuilder sb3 = new StringBuilder("three");
        StringBuilder[] array2 = {sb1, sb2, sb3};
        for (StringBuilder sb : array2){
//            sb = new StringBuilder("hello"); // ничего не изменится
            sb.append(".Java");

        }
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }

    }
}
