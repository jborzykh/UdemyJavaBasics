package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabc");
        System.out.println(s1);

        int a = s1.length();
        System.out.println(a);

        char b = s1.charAt(2);
        System.out.println(b);

        int i1 = s1.indexOf("e");
        System.out.println(i1);

        //на каком индексе находится a, начиная с 5
        int i2 = s1.indexOf("a", 5);
        System.out.println(i2);

        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        boolean b2 = s1.startsWith("adb");
        System.out.println(b2);

        boolean b3 = s1.startsWith("abc", 7);
        System.out.println(b3);

        boolean b4 = s1.startsWith("abc", 6);
        System.out.println(b4);

        boolean b5 = s1.endsWith("abc");
        System.out.println(b5);

        boolean b6 = s1.endsWith("cd");
        System.out.println(b6);


    }
}
