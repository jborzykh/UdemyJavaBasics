package Lesson18;

public class Test6 {
    public static void maxMin(double [] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }

    public static void main(String[] args) {
        double[] array1 = {1.1, 43.14, 119.00, 22.22};
        maxMin(array1);
        maxMin(new double[] {25.4, 3.0, 22.13, 22.14, 22.1});
    }
}
