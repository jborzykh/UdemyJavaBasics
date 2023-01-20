package Lesson9;

public class HW9 {
    public static void abc(){
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }

    public static void main(String[] args) {
        HW9 hW = new HW9();
        abc();
        abc();
        String s1 = new String("ABC");
        abc();

        // осталось только 2 объекта HW9 hW = new HW9(); и String s1 = new String("ABC");
    }
}
