package Lesson8;

public class HW2 {
    public  final static double PI = 3.14;

    public double circleSquare(double radius){
        double p1 = PI * radius * radius;
        return p1;

    }
    public static double circleRadius(double radius2){
        double d1 = 2 * PI * radius2;
        return d1;
    }

    public void info(double radius3){
        System.out.println("Radius = " + radius3);
        System.out.println("Square = " + circleSquare(radius3));
        System.out.println("Length = " + circleRadius(radius3));
    }
}

class HW2Test{
    public static void main(String[] args) {
        HW2 hW = new HW2();
        hW.circleSquare(5);
        HW2.circleRadius(12);
        hW.info(7.5);

    }
}
