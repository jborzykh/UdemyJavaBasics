package Lesson4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.addStudent(1, "Anna", "Ivanova", 1999,
                3.3, 4.0 ,5.0);

        student1.print();

        student2.addStudent(2, "Vasya", "Petrov", 2000,
        5,5,5);
        student2.print();

        student3.addStudent(3, "Petya", "Petrov", 2020,
                3, 4.8, 5);
        student3.print();

    }

}
