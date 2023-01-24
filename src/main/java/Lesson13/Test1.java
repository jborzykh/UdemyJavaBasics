package Lesson13;

public class Test1 {
}
class Student{
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student Petrov = new Student(-1);
//        if (Petrov.grade == 2){
//            System.out.println("dvoechnik");
//        }
//        else if (Petrov.grade == 3){
//            System.out.println("troechnik");
//        }
//        else if (Petrov.grade == 4){
//            System.out.println("horoshist");
//        }
//        else if (Petrov.grade == 5){
//            System.out.println("otlichnik");
//        }
//        else {
//            System.out.println("wrong");
//        }

        switch (Petrov.grade){
            case 2:
                System.out.println("dvoechnik");
                break;
            case 3:
                System.out.println("troechnik");
                break;
            case 4:
                System.out.println("horoshist");
                break;
            case 5:
                System.out.println("otlichnik");
                break;
            default:
                System.out.println("wrong");

        }
    }
}
