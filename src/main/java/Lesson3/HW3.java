package Lesson3;

public class HW3 {
    public static void main(String[] args) {
        int a = 5;
        int c = a-- - --a + ++a + a++ +a;
        System.out.println(c);

        int b = 8;
        int d = ++b - b++ + ++b - --b;
        System.out.println(d);

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result = 0;
        result1 = i2/d1;
        result2 = d2%i1;
        result3 = result1+result2;
        result = result3 - l;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result);
    }
}
