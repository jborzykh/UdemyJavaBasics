package Lesson18;

public class ShowArray {
    public static void showArray(String[][] array){
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++){
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++){
                if (j != array[i].length - 1){
                    System.out.print(array[i][j] + ", ");
                }
                else{
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1){
                System.out.print("}, ");
            }
            else {
                System.out.print("}");
            }
        }
        System.out.println(" } ");

    }

    public static void main(String[] args) {
        String array[] []= {
                {"apple", "orange"},
                {"hello", "buy", "ok"},
                {"car"}
        };
        showArray(array);
        showArray(new String[][] {
                {"woman", "man"},
                {"male", "female"}
        });
    }
}
