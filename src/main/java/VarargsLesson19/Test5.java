package VarargsLesson19;

public class Test5 {
    public static void main(String[] args) {
        int[][] array = {{3,6,8}, {2,4}, {1,3,6,9,12,15}};
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }


        }
        System.out.println();
        for (int [] array1 : array){
            for (int a : array1){
                System.out.print(a + " ");
            }
        }

    }
}
