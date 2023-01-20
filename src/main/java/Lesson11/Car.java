package Lesson11;

//поменять количество дверей у машины, поменять цвета машин местами

public class Car {
    String color;
    String engine;
    public  int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;


    }

}

class CarTest {
     void changeColor(Car c1, Car c2) {
       String color = c1.color;
       c1.color = c2.color;
       c2.color = color;
    }


     void changeDoors(Car c, int doors){
        c.doors = doors;
    }


    public static void main(String[] args) {
        CarTest cT = new CarTest();
        Car c1 = new Car("green", "v6", 4);
        Car c2 = new Car("red", "v8", 3);
        cT.changeDoors(c1, 6);
        cT.changeColor(c1, c2);
        System.out.println(c1.doors);
        System.out.println(c1.color);
        System.out.println(c2.color);


    }
}
