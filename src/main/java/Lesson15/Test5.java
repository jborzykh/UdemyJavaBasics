package Lesson15;

public class Test5 {
    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        do{
            int minute = 0;
            INNER:
        while(minute < 60){
            if (minute < 10) {
                System.out.println(hour + ":0" + minute);
            } else {
                System.out.println(hour + ":" + minute);
            }
            minute++;
        }
        hour++;
        }
        while(hour < 24);
    }
}
