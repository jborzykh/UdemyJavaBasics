package Lesson12;

import java.util.Objects;

public class Student {
    String name;
    int course;
    int age;

    public Student(String name, int course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }
      public static void method1(Student Student1, Student Student2) {
        if (Student1.name.equals(Student2.name) && (Student1.course == Student2.course) && (Student1.age == Student2.age)) {
            System.out.println("Students are same");
        } else {
            System.out.println("Students are different");
        }
    }

     public static void method2(Student Student1, Student Student2) {
        if (Student1.name.equals(Student2.name)) {
            if (Student1.course == Student2.course) {
                if (Student1.age == Student2.age) {
                    System.out.println("Students are equal");
                } else {
                    System.out.println("Age is different, names and courses are the same");
                }
            } else {
                System.out.println("Names are same, courses are different");
            }
        } else {
            System.out.println("Names are different");
        }
    }


}

class StudentTest {


    public static void main(String[] args) {
        Student Ivanov = new Student("Ivan", 2, 20);
        Student Petrov = new Student("Ivan", 3,30);
    Student.method1(Ivanov, Petrov);
    Student.method2(Ivanov, Petrov);
    }


}








