package VarargsLesson19;

public class Test3 {
    public static void main(String[] args) {
        int [] array = {20, 1 ,0, 18,2};
        int summa = 0;
        for (int a : array){
            summa += a;

        }
        System.out.println(summa);
    }
}
