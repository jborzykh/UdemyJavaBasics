package Lesson16;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    public Car abc(String cvet){
        Car c10 = new Car(cvet, "v4");
        return c10;
    }

    public static void main(String[] args) {
        Car c1 = new Car("red", "v6");
        Car c2 = c1.abc("black");
        System.out.println(c1.color);
        System.out.println(c2.color);
    }
}

//class TestCar{
//    final static Car c = new Car("red", "v8");
//
//    public static void main(String[] args) {
//        c.color = "green";
//    }
//}
