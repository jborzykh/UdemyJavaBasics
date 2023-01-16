package Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    double salary;
    String department;


    public Employee( int id2){
        id = id2;
    }

    Employee(String surname2){
        surname = surname2;

    }

    private Employee(double salary2){
        salary = salary2;
    }



    double increaseSalary(){
       double result = salary * 2;
       return result;

    }

    public void getID(){
        System.out.println("ID: " + id);
    }

    public void getSurname(){
        System.out.println("SURNAME: " + surname);
    }

    public void getSalary(){
        System.out.println("SALARY: " + salary);
    }


}
