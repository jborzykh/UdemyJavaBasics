package Lesson16;

public class Test4 {

}

class Employee{
    double salary;
    boolean isManager;


    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, true);
        System.out.println("is he manager? " + emp1.isManager + " and his salary is " + emp1.salary);
        // System.out.println(emp1.isManager + emp1.salary); ошибка компиляции
    }
}
