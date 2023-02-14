package Lesson16;



public class Test10 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3 == s4); //true
        System.out.println(s3.equals(s4)); //true


        System.out.println(s1 != s4);

        String s5 = "how are you?";
        String s6 = "How are you?";
        System.out.println(s5.equals(s6)); //false
        System.out.println(s5.equalsIgnoreCase(s6)); //true


    }
}
