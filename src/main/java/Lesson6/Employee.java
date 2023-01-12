package Lesson6;

public class Employee {
    String employee;
    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee(int id1, String surname1, int age1) {
//        id = id1;
//        surname = surname1;
//        age = age1;

        //чтобы не повторять код вставляем самый короткий контструктор
        this(surname1, age1); // this вместо Employee(surname1, age1) - конструктор внутри конструктора
        id = id1;
    }

    Employee(String surname2, int age2) {
        surname = surname2;
        age = age2;
    }

    Employee(int id3, String surname3, int age3, int salary3, String department3) {
//        id = id3;
//        surname = surname3;
//        age = age3;
//        salary = salary3;
//        department = department3;
        this(id3,surname3, age3);
        salary = salary3;
        department = department3;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ivanov", 30);
        System.out.println(e1.surname);

        Employee e2 = new Employee("Ivanov", 30);
        System.out.println(e2.surname +" " + e2.age);

        Employee e3 = new Employee(1, "Ivanov", 30, 1000, "economocs");
        System.out.println(e3.surname + " " + e3.department);

    }
}
