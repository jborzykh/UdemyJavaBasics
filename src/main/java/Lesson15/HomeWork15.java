package Lesson15;

public class HomeWork15 {


    static void countTime() {
        int hour = 0;
        HOUR:
        while (hour < 6) {
            int minute = 0;


            MINUTE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break HOUR;
                }
                int second = 0;


                SECONDS:
                while (second < 60) {
                    if (second * hour > minute) {
                        continue MINUTE;
                    }
                    if (minute < 10 && second < 10  ) {
                        System.out.println(hour + ":0" + minute + ":0" + second);
                    } else if (minute < 10 && second > 9) {
                        System.out.println(hour + ":0" + minute + ":" + second);
                    } else if (second < 10 && minute > 9) {
                        System.out.println(hour + ":" + minute + ":0" + second);
                    } else {
                        System.out.println(hour + ":" + minute + ":" + second);
                    }
                    second++;


                }

            }

            while (minute < 60);
            hour++;


        }

    }

    public static void main(String[] args) {
        countTime();
    }
}

