package VarargsLesson19;

public class Test7 {
    public static void main(String[] args) {
        int[] array = new int [4];

//        for (int i = 0; i < array.length; i++){
//            array[i] = i*10;
//        }

        for (int b : array){
            b = 10;
        } // с помощью foreach loop нельзя провести динамическую инициализацию массива, будут все равно нули

        for (int a : array){
            System.out.print(a + " ");
        }
    }
}
