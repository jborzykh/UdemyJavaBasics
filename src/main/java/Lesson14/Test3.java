package Lesson14;

public class Test3 {
    public static void main(String[] args) {

        // цикл останавливается на 7
        for (int i = 1; i < 10; i++){
            if (i == 7){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        // цикл не выводит 7
        for (int i = 1; i <= 10; i++){
            if (i == 7){
                continue;
            }

            // останавливается на 9
            if (i % 9 == 0){
                break;

            }
            System.out.println(i);
        }
    }
}
