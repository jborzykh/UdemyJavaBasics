package Lesson11;

public class Student {
    public String name;
    public String course;
    public int grade;

    Student(String name, String course, int grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
        // студенты меняются только внутри этого метода, в мейн изменений не происходит
    }

    public static void changeName(Student s1){
        s1.name = "Masha";
        // имя меняется на новое Маша
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "english", 5);
        Student s2 = new Student("Vasya", "java", 3);


        swap(s1, s2);
        System.out.println(s1.name);
        System.out.println(s2.course);

        changeName(s2);
        System.out.println(s2.name);



    }
}
