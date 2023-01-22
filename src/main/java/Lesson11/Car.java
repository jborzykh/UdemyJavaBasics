package Lesson11;

//поменять количество дверей у машины, поменять цвета машин местами

public class Car {
    String color;
    int engine;
    public  int doors;

    public Car(String color, int engine, int doors) {
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
        Car c1 = new Car("green", 4, 4);
        Car c2 = new Car("red", 3, 6);
        cT.changeDoors(c1, 6);
        cT.changeColor(c1, c2);
        System.out.println(c1.doors);
        System.out.println(c1.color);
        System.out.println(c2.color);

        //12 урок
        if(c1.engine > c2.engine) {
            if (c1.doors > c2.doors) {
                System.out.println("Car1 is cooler than Car2");
            }
            else{
                System.out.println("Car2 is cooler than Car1");
            }
        }
        else{
            System.out.println("cars are cool");
        }
        if (c1.color.equals(c2.color)){
            System.out.println("Color");
        }
        else{
            System.out.println("Different colors");
        }


    }
}
