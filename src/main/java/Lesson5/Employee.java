package Lesson5;

public class Employee {
    private String employee;
    private int id;
    private String surname;
    private int age;
    private int salary;
    private String department;
    private int newSalary;

    public Employee(int id, String surname, int age, int salary, String department){
        employee = "Employee: " + id + " " + surname + " " + age + " " + salary + " " + department;
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int increaseSalary(){
        this.newSalary = this.salary * 2;
        employee = "Employee: " + id + " " + surname + " " + age + " " + newSalary + " " + department;
        return newSalary;
    }


    void print(){
        System.out.println(employee);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "A", 50, 1000, "d");
        e1.print();
        e1.increaseSalary();
        e1.print();

        Employee e2 = new Employee(1, "B", 50, 1333, "C");
        e2.print();
        e2.increaseSalary();
        e2.print();


    }
}
