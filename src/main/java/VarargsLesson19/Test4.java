package VarargsLesson19;

public class Test4 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"Java", "Scrum"};


        for (String s1 : students) {
            for (String s2 : exams) {

                System.out.println(s1 + " " + s2);

            }
        }
    }
}
