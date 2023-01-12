package Lesson6;

public class MethodOverloadingRules {
    int sum(int i1, int i2){
        return i1+ i2;

    }
    String sum (String s1, String s2){
        return s1 + s2;
    }
}
class MethodOverloadingRulesTest {
    public static void main(String[] args) {
        MethodOverloadingRules mO = new MethodOverloadingRules();
        int a = mO.sum(5,7);
        System.out.println(a);

        String s = mO.sum("hello, ", "my friend");
        System.out.println(s);
    }
}
