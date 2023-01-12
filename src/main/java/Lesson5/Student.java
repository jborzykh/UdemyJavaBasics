package Lesson5;

public class Student {
    private String student = " ";
    private double averagePoints = 0;

    void addStudent(int id, String name,  String lastName, int year){

        student = name + " " + lastName;
    }
    double averagePoints(double mathAv, double economicsAv,double foreignAv){
    averagePoints = averagePoints + (mathAv + economicsAv + foreignAv) / 3;
    return averagePoints;
}
    void print(){
        System.out.println("Average grade of " + student + ": " + averagePoints);

    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.addStudent(1, "Vasya", "Petrov", 2000);
        student1.averagePoints(3,4,5);
        student1.print();
    }


}


