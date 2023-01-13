package Lesson6;

public class Student {
    int id;
    String name;
    String lastName;
    String course;


    public Student(int id1, String name1, String lastName1, String course1) {
        id = id1;
        name = name1;
        lastName = lastName1;
        course = course1;
    }

    Student(int id2, String name2, String lastName) {
        this(id2, name2, lastName, null);
    }
    Student( int id3, String name3){
        this(id3, name3, null, null);
    }

    Student(){
        System.out.println("No such student!");
    }

}
class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ivan", "Ivanov", "english");
        System.out.println(s1.id + " " + s1.name + " " + s1.lastName + " " + s1.course);

        Student s2 = new Student();

    }
}
