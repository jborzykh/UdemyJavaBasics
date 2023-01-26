package Lesson15;

public class Test4 {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++){
            int minute = 0;
            while (minute < 60){
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }
}
