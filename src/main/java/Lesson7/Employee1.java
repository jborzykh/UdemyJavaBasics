package Lesson7;

public class Employee1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee("Ivanov");
        Employee e3 = new Employee(1000);

        System.out.println(e1.id);
        System.out.println(e1.surname);
        System.out.println(e1.salary);

        System.out.println(e2.id);
        System.out.println(e2.surname);
        System.out.println(e2.salary);

        System.out.println(e3.id);
        System.out.println(e3.surname);
        System.out.println(e3.salary);

        e1.getID();
        e1.getSurname();
        e1.getSalary();
        e1.increaseSalary();
    }
}
