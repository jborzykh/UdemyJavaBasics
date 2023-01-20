package Lesson8;

public class HW1 {

    static double result(double a, double b, double c ){
        return  a * b * c;

    }

    static void divide(int a, int b) {
        System.out.println("a:b=" + a/b +","+ "remainder " + a%b);

    }


}

class countResult {
    public static void main(String[] args) {
        System.out.println(HW1.result(100, 3,6));
        HW1.divide(17,5);
    }
}

