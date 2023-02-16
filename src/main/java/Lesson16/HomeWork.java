package Lesson16;

public class HomeWork {
    public void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));

        }
    }

    public static void main(String[] args) {
        HomeWork HW = new HomeWork();
        HW.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");


    }
}




//        char c1;
//        String strEmail;
//        try {
//            for (int i = 0; i < email.length(); i++) {
//                c1 = email.charAt(i);
//
//                if (c1 == ' ') {
//                    System.out.println();
//                    System.out.print(c1);
//                    continue;
//
//                }
//                strEmail = String.valueOf(c1);
//                String resultEmail = strEmail.trim().substring(strEmail.indexOf("@") + 1, strEmail.indexOf("."));
//                System.out.print(resultEmail);
//
//            }
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("String index out of bounds. String length: " + email.length());
//        }

//    public static String getMail(String email){
//        String charsetStr = "@";
//        int start = email.indexOf(charsetStr) + charsetStr.length();
//        int end  = email.indexOf('.', start);
//        if (start < 0 || end < 0){
//            return "";
//        }
//        String encoding = email.substring(start,end);
//        return encoding;
//    }