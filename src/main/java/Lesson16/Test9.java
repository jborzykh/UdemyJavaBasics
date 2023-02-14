package Lesson16;

public class Test9 {
    public static void main(String[] args) {
        String s =  "Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала: Ты лучше голодай, чем что попало есть, И лучше будь один, чем вместе с кем попало.";

        String s1 = s.toUpperCase();
        char c1;
        char c2;
        //System.out.println(s1); // печтатает все в одну строку с заглавной буквы
        for(int i = 0; i < s1.length(); i++){
            c1 = s.charAt(i);
            c2 = s1.charAt(i);
            if(c1 != '.' && c1!= ':' && c1 != ' ' && c1 != ',' && c1 == c2 ){
                System.out.println();
                System.out.print(c1);  //печатает только заглавные буквы
                continue;
            }
            System.out.print(c1); // печатает с новой строки перед каждой заглавной буквой
        }
        System.out.println();
    }


}
