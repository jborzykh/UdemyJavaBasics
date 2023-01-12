package Lesson5;

public class Practice5 {
    //пишем метод
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    int averageSpeed(int a1, int b1, int c1){
        int result2 = summa(a1 , b1 , c1)/3;
        return result2;

    }
}


    class Practice {
        public static void main(String[] args) {
            Practice5 P = new Practice5();
            int sumOfThreeNumbers = P.summa(1, 2, 3);
            System.out.println(sumOfThreeNumbers);
            System.out.println(P.summa(3, 4 ,5));
            System.out.println(P.averageSpeed(20,40,60));
        }

    }

