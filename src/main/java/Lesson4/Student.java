package Lesson4;

public class Student {
    private String student = " ";
    private double averagePoints = 0;
    double mathAv;
    double economicsAv;
    double foreignAv;

    public void addStudent(int id, String name,  String lastName,
    int year, double mathAv, double economicsAv, double foreignAv){
        averagePoints = averagePoints + (mathAv + economicsAv + foreignAv) / 3;
        student = name + " " + lastName + " " + averagePoints;


    }


    public void print(){
        System.out.println("Average grade of " + student);

    }


}


