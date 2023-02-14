package Lesson16;

// concat  можно заменить на +

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";

        System.out.println(a + b + s); // 5 + 6 = 11, output 11ok
        System.out.println("" + a + b + s); // output 56ok
        System.out.println("" + (a + b) + s); // output 11ok

//        int c = 7;
//        String s1 = "hello";
//        String s2 = c + s1 ошибка компиляции
    }
}
