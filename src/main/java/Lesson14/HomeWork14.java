package Lesson14;

public class HomeWork14 {
    static void countTime() {
        HOUR:
        for (int hour = 0; hour <= 6; hour++) {
            MINUTE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break HOUR;
                }

                SECOND:
                for (int second = 0; second < 60; second++) {

                    if (second * hour > minute) {
                        continue MINUTE;
                    }
                    if (minute < 10 && second < 10) {
                        System.out.println(hour + ":0" + minute + ":0" + second);
                    } else if (minute < 10 && second > 9) {
                        System.out.println(hour + ":0" + minute + ":" + second);
                    } else if (second < 10 && minute > 9) {
                        System.out.println(hour + ":" + minute + ":0" + second);
                    } else {
                        System.out.println(hour + ":" + minute + ":" + second);
                    }
                }
            }

        }

    }

    public static void main(String[] args) {

        countTime();
    }
}

