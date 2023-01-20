package Lesson9;

public class Test2 {
    int a = 5;
    static int b = 10;
    static void abc(final int a){
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(3);
    }
}
