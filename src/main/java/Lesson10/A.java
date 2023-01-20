package Lesson10;
import Lesson9.Car;
import Lesson9.*; //импорт всех классов из пакета 9 урока
//import Lesson8.*; если указать так оба, то непонятно из какого брать класс Car
import static Lesson9.Car.count;

public class A {
    //static int count = 99; тогда count будет = 99, а не количесву машин в уроке 9
    public static void main(String[] args) {
        Lesson9.Car c = new Lesson9.Car("red", "v6"); //без import Lesson9.Car
        Car c1 = new Car("black", "v8"); //после добавления второй строчки import Lesson9.Car

        Student st1 = new Student();
        Student st2 = new Student();
        System.out.println(st1.z);
        System.out.println(st2.y);
        System.out.println(count);
    }
}
