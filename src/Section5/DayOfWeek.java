package Section5;

public class DayOfWeek {

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }


    public static void main(String[] args) {
        printDayOfTheWeek(2);
        printDayOfTheWeek(7);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(11);
    }

}
