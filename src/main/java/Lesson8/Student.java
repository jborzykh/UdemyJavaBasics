package Lesson8;

import org.w3c.dom.ls.LSOutput;

public class Student {
    String name;
    int course;
    static int count;
    int a;
    // если будет не static  считать студентов не будет, будет всегда 1
    public Student (String name, int course){
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student # " + count + " "+ name);
    }
    public static void showCount(){
        System.out.println("The quantity of students now is " + count);

    }

    public void showInfo(){
        System.out.println("Welcome!");
    }

    void abc(){
        a++;
        System.out.println(a);
    }

    static void abcd(){
        // count++; ошибки не будет, потому что он static
        //a++;  будет ошибка
        Student st1 = new Student("Masha", 5);
        st1.a++;

    }

    public static void main(String[] args) {
        abcd();
        showCount();
        // abc();  не можем запустить, не принадлежит калссу Student
        Student st2 = new Student("Petya", 1);
        st2.abc();
        st2.showInfo();
        System.out.println(Student.count);
    }

}
class Test{
    public static void main(String[] args) {
//        Student s1 = new Student("Ivan", 1);
//        Student s2 = new Student("Pavel", 4);
//        System.out.println(Student.count);


    }
}
