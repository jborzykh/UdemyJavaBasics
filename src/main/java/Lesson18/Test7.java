package Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char[] hello = {'h', 'e', 'l', 'l', 'o'};

        String s = new String(hello);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("hello, world");
        //sb.append(hello, 2,3);

        sb.insert(2, hello, 0,4);
        System.out.println(sb);
    }
}
