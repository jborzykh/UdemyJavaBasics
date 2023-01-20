package Lesson8;

public class Test1 {
    public  int a = 10;
    public final int b = 5;
    public final int c;

    Test1(){
        c = 15;
    }

    // public final int a = 10 - мы не сможем изменить а, она всегда будет равна 10

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.a = test1.a * 2;
        System.out.println(test1.a);
        System.out.println(test1.b);
        System.out.println(test1.c);
    }
}
