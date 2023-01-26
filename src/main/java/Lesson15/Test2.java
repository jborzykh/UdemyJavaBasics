package Lesson15;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0){
            System.out.println("play more");

            money -=10;
        }
        System.out.println("you lost");
        int dollars = 40;
        do{
            System.out.println("delayte stavku");
            dollars -=100;
        }
        while( dollars > 50);
        System.out.println("you lost");
    }

}
