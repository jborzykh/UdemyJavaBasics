package Lesson17;

public class HomeWork {

    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;

    }


    public static void main(String[] args) {
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("hello");
        StringBuilder sb6 = new StringBuilder("Hello");
        boolean a = HomeWork.equality(sb4, sb5);
        System.out.println(a);
        System.out.println(HomeWork.equality(sb4, sb6));
        System.out.println(HomeWork.equality(new StringBuilder(""), new StringBuilder(" ")));
        System.out.println(HomeWork.equality(new StringBuilder(), new StringBuilder()));


    }
}
