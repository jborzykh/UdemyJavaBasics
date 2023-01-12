package Lesson6;

public class MethodOverloading {
//    void showInt(int i1){
//        System.out.println(i1);
//    }
//    void showBoolean (boolean b1){
//        System.out.println(b1);
//    }
//
//    void showString (String s1){
//        System.out.println(s1);
//    }

    //with overloading
    void show(int i1){
        System.out.println(i1);
    }
    void show (boolean b1){
        System.out.println(b1);
    }

    void show (String s1){
        System.out.println(s1);
    }
    void show (String s, int a){
        System.out.println("String s - " + s + "int a: " + a);
    }

    void show (int a, String s){
        System.out.println("What a wonderful day!");
    }

}
class MethodOverloadingTest{
    public static void main(String[] args) {
//        MethodOverloading mO = new MethodOverloading();
//        int a = 500;
//        mO.showInt(a);
//
//        boolean b = true;
//        mO.showBoolean(b);
//
//        String s = "Hello";
//        mO.showString(s);

        // with overloading
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s = "Hello";
        mO.show(s);
        mO.show("Hello, ", 10);
        mO.show(10, "Hello!");
    }
}
