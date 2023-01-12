package Lesson5;

public class Car {
    String color;
    String engine;
    int speed;

    int gas(int velocity){
        speed += velocity;
        return speed;
    }
    int stop(int velocity){
        speed += velocity;
        return speed;
    }
    void showInfo(){
        System.out.println(color + " " + engine +" " + speed);
    }

}
class CarTest{
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.color = "white";
        C1.engine = "V6";
        C1.speed = 60;
        C1.showInfo();

        C1.gas(20);
        C1.showInfo();

        C1.stop(30);
        C1.showInfo();

    }
}
