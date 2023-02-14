package Lesson16;

public class Test11 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        System.out.println(x == y); //true

        String z = "   privet".trim();
        System.out.println(x == z); //false
        System.out.println(y == z); //false
    }
}
