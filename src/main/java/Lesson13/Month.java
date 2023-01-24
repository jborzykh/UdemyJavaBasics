package Lesson13;


class Month{
    public static void dayOfMonth (int month) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 days in Month");
                    break;
                case 2:
                    System.out.println("28 days in Month");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days in Month");
                    break;
                default:
                    System.out.println("no such Month");


            }

        }

        public static void main(String[] args) {
        Month.dayOfMonth(0);
        dayOfMonth(5);
        dayOfMonth(2);
        dayOfMonth(50);
        }
    }

