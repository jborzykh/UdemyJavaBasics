package Lesson16;

//substring

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        System.out.println(s1);

        String s2 = s1.substring(3);
        String s3 = s1.substring(3,7); // 7 не будет включен, в s3 будут только char 3,4,5,6 d, e, f, g
        System.out.println(s2);
        System.out.println(s3);



        String s4 = new String("    hello      ");

        String s5 = s4.trim(); // убирает лищние пробелы по бокам
        System.out.println(s5);

        String s6 = s4.replace('o', 'a');
        System.out.println(s6.trim());

        String s7 = s4.replace("llo", "lado");
        System.out.println(s7);

        String s8 = s4.replace('l', 'l');
        System.out.println(s8 == s4); //true, потому что '' - char

        String s9 = s4.replace("l", "l");
        System.out.println(s9 == s4); //false, потому что "" - String


        String s10 = new String(" hello, ");
        String s11 = new String("friend");
        System.out.println(s10.concat(s11));

    }
}
