package Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s = "hello^2";

        boolean b = s.contains("^2");
        System.out.println(b);

        boolean c = s.contains("a");
        System.out.println(c);
    }
}
