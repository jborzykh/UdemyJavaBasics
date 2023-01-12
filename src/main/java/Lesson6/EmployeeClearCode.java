package Lesson6;

public class EmployeeClearCode {

        int id;
        String surname;
        int age;
        int salary;
        String department;

        EmployeeClearCode(int id1, String surname1, int age1) {
            this(id1, surname1, age1, 0, null);
        }



        EmployeeClearCode(String surname2, int age2) {
            this(0, surname2, age2, 0, null);

        }

        EmployeeClearCode(int id3, String surname3, int age3, int salary3, String department3) {
        id = id3;
        surname = surname3;
        age = age3;
        salary = salary3;
        department = department3;

        }

    }

    class EmployeeClearCodeTest {
        public static void main(String[] args) {
            EmployeeClearCode e1 = new EmployeeClearCode(1, "Ivanov", 30);
            System.out.println(e1.surname);

            EmployeeClearCode e2 = new EmployeeClearCode("Ivanov", 30);
            System.out.println(e2.surname +" " + e2.age);

            EmployeeClearCode e3 = new EmployeeClearCode
                    (1, "Ivanov", 30, 1000, "economocs");
            System.out.println(e3.surname + " " + e3.department);

        }
    }


