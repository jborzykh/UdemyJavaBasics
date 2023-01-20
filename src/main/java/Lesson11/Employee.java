package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double increaseSalaryTwice(double a){
        a =a * 2;
        return a;
    }
    public double increaseS(){
        salary = salary * 2;
        return salary;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", 100.55);
        double newSalary = e1.increaseSalaryTwice(e1.salary);
        System.out.println(newSalary);
        System.out.println(e1.salary);


        e1.increaseS();
        System.out.println(e1.increaseS());
    }
}
