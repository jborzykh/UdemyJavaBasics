package VarargsLesson19;

public class Test1 {
    public static void summa(int... a){
        int summa = 0;
        for(int i = 0; i < a.length; i++){
            summa += a[i];
    }
        System.out.println(summa);

    }
    public static void summa1(String s, int... a){
        int summa1 = 0;
        for(int i = 0; i < a.length; i++){
            summa1 += a[i];
        }
        System.out.println(summa1);
        System.out.println(s);

    }
    public static void summa2(String s, int[] a, String c){
        //если между String, то varargs использовать нельзя, только массив
        int summa2 = 0;
        for(int i = 0; i < a.length; i++){
            summa2 += a[i];
        }
        System.out.println(summa2);
        System.out.println(s);
        System.out.println(c);

    }

    //Compile time error  - одно и тоже
//    public void abc (int ... a){
//        some code;
//    }
//    public void abc (int array []){
//        some code;
//    }

    public static void main(String[] args) {
        summa(3,6,9);
        summa1("ok", 2,4,6);
    }
}
