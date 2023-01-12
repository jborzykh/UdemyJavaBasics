package Lesson3;

public class Test5 {
    public static void main(String[] args) {
        int a = 5;
        a += 3;
        // a -= 3;
        // a *= 3;
        // a /= 3;
        System.out.println(a);

        //присовение начинается справа налево
        int x = 50;
        int y = 3;
        int z = 20;
        x = y = z = 18;
        // сначала z  становится = 18, потом y, поттом x
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
