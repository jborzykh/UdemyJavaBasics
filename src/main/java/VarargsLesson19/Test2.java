package VarargsLesson19;

public class Test2 {
    public static void main(String[] args) {
        int [] array = {0, 4, 6, 1};

        //for loop
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // foreach loop
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
