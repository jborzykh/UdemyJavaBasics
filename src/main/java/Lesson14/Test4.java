package Lesson14;

public class Test4 {
    public void time() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("начало outerloop");
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                if (minute < 10) {
                    System.out.println(hour + ":0" + minute);
                } else {
                    System.out.println(hour + ":" + minute);
                }
                if (minute == 30) {
                    break OUTER; // пишем лейбл лупа,
                    // которые хотим остановить,
                    // если не писать, то по умолчанию брейк будет у внутреннего лупа
                }

            }
            System.out.println("конец outerloop");
        }
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.time();
    }
}
