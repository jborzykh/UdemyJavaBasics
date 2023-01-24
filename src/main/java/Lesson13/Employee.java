package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Friday") {
            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":
                System.out.println("Work!!!");
                break;
            case "Friday":
                System.out.println("Work!!! && Beer");
                break;
            case "Saturday":

            case "Sunday":
                System.out.println("Day off");
                break;
            default:
                System.out.println("no such day");
        }
    }
}
