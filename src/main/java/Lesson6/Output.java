package Lesson6;

public class Output {
    int a;
    int b;
    int c;
    int d;
    int e;

    Output(int a1, int b1, int c1, int d1, int e1) {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e = e1;
    }

    Output(int a2, int b2, int c2, int d2) {
        this(a2, b2, c2, d2, 0);
    }

    Output(int a3, int b3, int c3) {
        this(a3, b3, c3, 0, 0);
    }

    Output(int a4, int b4) {
        this(a4, b4, 0, 0, 0);

    }

    Output(int a5) {
        this(a5, 0, 0, 0, 0);
    }

    Output() {
        this(0, 0, 0, 0, 0);

    }

    int result() {
        return a + b + c + d + e;


    }

}

class OutputTest {
    public static void main(String[] args) {
        Output o1 = new Output();
        System.out.println(o1.result());

        Output o2 = new Output(4);
        System.out.println(o2.result());

        Output o3 = new Output(5, 7);
        System.out.println(o3.result());

        Output o4 = new Output(1, 2, 3);
        System.out.println(o4.result());

        Output o5 = new Output(10, 20, 30, 40);
        System.out.println(o5.result());

        Output o6 = new Output(1, 6, 7, 8, 9);
        System.out.println(o6.result());
    }
}
