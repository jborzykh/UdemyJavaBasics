package Lesson16;
//chaining  - цепочка слева направо

public class Test8 {
    public static void main(String[] args) {
        String s1 = "Hello, world!   ";
        String s2 = "Hurray!!!";
        String s3 = s1.concat(s2).trim().replace("world", "Julia").substring(6, 10);

        // concat Hello, world!     Hurray!!!
        //trim убирает пробелы по бокам
        //replace world на Julia  Hello, Julia!   Hurray!!!
        //substring Jul
        System.out.println(s3);

        //обрезает String до w
        System.out.println(s1.substring(s1.indexOf("w"))); // не метод chaining

        s1.concat(s2).trim().replace("world", "Julia").substring(6, 10);
        System.out.println(s1); // s1 immutable - никак не изменится!!! output Hello, world!

    }
}
