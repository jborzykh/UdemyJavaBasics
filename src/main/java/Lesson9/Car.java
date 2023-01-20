package Lesson9;

public class Car {
    String color;
    String engine;
    public static int count;
    static int price = 5000;

    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor(){
        System.out.println("the color of car is " + color);

    }

    public void changeColor(String color){
        this.color = color;
        System.out.println("the color of car has been changed to " + color);
        price += 1000;
        System.out.println("new price is " + price);
    }


}

class CarTest{
    public static void main(String[] args) {
        Car car = new Car("green", "v8");
        car.showColor();
        car.changeColor("red");
        car.showColor();


        Car car1 = new Car("black", "v6");
        car1.showColor();
        System.out.println(Car.count);

    }
}
