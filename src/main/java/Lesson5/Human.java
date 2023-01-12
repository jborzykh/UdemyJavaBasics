package Lesson5;

public class Human {
    String name;
    Car3 car;
    bankAccount bA;


    void info() {
        System.out.println(name + "\n" + "car color: " + car.color + " car engine: "+ car.engine
                + "\nid: "+ bA.id + " balance: "+ bA.balance);
    }

}
    class HumanTest{
        public  static void main(String[] args) {
            Human h = new Human();
            h.name = "Vasya";
            h.car = new Car3("green", "v6");
            h.bA = new bankAccount(1, 1000);
            h.info();



        }
    }

class Car3{
    Car3(String a, String b){
        color = a;
        engine = b;
    }
        String color;
    String engine;

}
class bankAccount{
 bankAccount( int id1, int balance1){
    id = id1;
    balance = balance1;


}


    int id;
    int balance;





}
