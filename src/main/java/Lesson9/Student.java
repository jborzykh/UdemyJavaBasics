package Lesson9;

public class Student {
    // переменные для Lesson10
    public int z = 5;
    public static int y = 10;
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3; // не создает объект
        st1 = null; //обнулился адрес st1;

    }
}
