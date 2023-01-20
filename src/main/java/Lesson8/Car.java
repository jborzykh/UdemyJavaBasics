package Lesson8;

public class Car {
    String color = "red";
    String engine = "v6";

}
class Human{
    String name = "Ivan";
    //final
    Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();

        //добавили final к Car , теперь гельзя поменять машину, но поменять двигатель можно
        h1.c = new Car();
        h1.c.engine = "v8";
    }
}