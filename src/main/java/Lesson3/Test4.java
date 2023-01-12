package Lesson3;

public class Test4 {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 10;
//        System.out.println(a+b);
//        System.out.println(b - a);
//        System.out.println(a * b);
//        System.out.println(b / a);
//
//        int c = a + b;
//        System.out.println(c);
//
//        int d = b - a;
//        System.out.println(d);

//        double a = 10;
//        double b = 3;
//
//        System.out.println(a/b);
//
//        int c = 11;
//        int d = 3;
//        System.out.println(c % d );

//        int a = 5;
//        int b = 3;
//        int c = a - b++;
//        System.out.println(b);
//        System.out.println(c);

//        int a = 5;
//        int b = 3;
//        int c = a - ++b;
//        System.out.println(b);
//        System.out.println(c);

//        int a = 5;
//        int b = 3;
//        int c = a - b--;
//        System.out.println(b);
//        System.out.println(c);

//        int a = 5;
//        int b = 3;
//        int c = a - --b;
//        System.out.println(b);
//        System.out.println(c);

        int a = 5;
        int b = ++a - --a - a-- + a++;
        // ++a = 6
        //--a = 5, ++a - --a = 6-5
        // a-- = 5, ++a - -- a - a-- = 6-5-5, a = 4
        // a++ = 4, ++a - --a - a-- + a++ = 6-5-5+4? a = 5
        System.out.println(a);
        System.out.println(b);




    }
}
